pipeline {
  agent {
    kubernetes {
      label 'migration'
    }
  }
  
  parameters {
    choice(name: 'RELEASE_TYPE', choices: ['Integration', 'Beta', 'M1', 'M2', 'M3', 'RC1', 'RC2', 'GA'], description:
'''Kind of release to build. The chosen value is dependent on the parameter BUILD_TYPE. Use value:
<ul>
  <li><tt>Integration</tt>: Continuous Build</li>
  <li><tt>GA</tt>: Release Build</li>
  <li>Any other: Stable/Milestone Build</tt></li>  
</ul>''')
    booleanParam(
      name: 'FORCE_PUBLISH',
      defaultValue: false, 
      description: 'Force publishing of build artifacts to Eclipse project storage & OSSRH?'
    )
  }
  
  triggers {
    parameterizedCron(env.BRANCH_NAME == 'master' ? '''H H(0-1) * * *''' : '')
  }

  options {
    buildDiscarder(logRotator(numToKeepStr:'5'))
    disableConcurrentBuilds()
    timeout(time: 60, unit: 'MINUTES')
    timestamps()
  }

  environment {
    PROJECT_STORAGE_PATH = '/home/data/httpd/download.eclipse.org/modeling/emft/mwe'
    DOWNLOAD_AREA = "$PROJECT_STORAGE_PATH/downloads/drops"
    KEYRING = credentials('11ef2671-e2bc-4da7-8f89-f4b0ba8ffa3e')
    SCRIPTS = "$WORKSPACE/git-repo/releng/jenkins/scripts"
  }

  stages {
    stage('Prepare') {
      steps {
        dir ('git-repo') {
          checkout scm
        }

        sh '''
          # Clean up the build result
          rm -rf build-result/
          mkdir -p build-result/downloads/
          mkdir -p build-result/javadoc/
          mkdir -p build-result/composite/
          # Make .mvn/extensions.xml available for the build (for tycho-pomless extension)
          cp -r git-repo/maven/.mvn .

          # call the versioning script when a release is built
          # this will set the final release number for Maven artifacts according to RELEASE_TYPE
          # and disable strict version checking by Tycho, so that p2 artifacts keep their qualifier
          if [ "$RELEASE_TYPE" != "Integration" ]; then
            pushd $(pwd) && cd git-repo
            bash ./set_version.sh --release=$RELEASE_TYPE
            popd
          fi
          
          gpg --batch --import "${KEYRING}"
          for fpr in $(gpg --list-keys --with-colons  | awk -F: '/fpr:/ {print $10}' | sort -u);
          do
            echo -e "5\ny\n" | gpg --batch --command-fd 0 --expert --edit-key $fpr trust;
          done
        '''
      } // END steps
    } // END stage

    stage ('Build') {
      steps {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
          withMaven(jdk: 'adoptopenjdk-hotspot-jdk8-latest', maven: 'apache-maven-latest') {
            dir ('git-repo') {
              sh ''' 
                if [ "${BRANCH_NAME}" == "master" ] || [ "${RELEASE_TYPE}" != "Integration" ] || [ "${FORCE_PUBLISH}" == "true" ]; then
                  GOALS='clean javadoc:aggregate-jar deploy'
                else
                  GOALS='clean javadoc:aggregate-jar verify'
                fi
                
                case "$RELEASE_TYPE" in
                  Integration) BUILD_TYPE='N' ;;
                  GA) BUILD_TYPE='R' ;;
                  *) BUILD_TYPE='S' ;;
                esac
                
                mvn \
                  -f maven/org.eclipse.emf.mwe2.parent/pom.xml \
                  -Dsign.skip=false \
                  -DtestFailureIgnore=true \
                  -Dmaven.javadoc.failOnError=false \
                  -Dtycho.localArtifacts=ignore \
                  -DBUILD_TYPE=$BUILD_TYPE \
                  $GOALS
              '''
            }
          }
        }
      } // END steps
    } // END stage

    stage ('Publish') {
      when {
        expression { env.BRANCH_NAME == 'master' || params.RELEASE_TYPE != 'Integration' || params.FORCE_PUBLISH }
      }
      steps {
        sshagent(['projects-storage.eclipse.org-bot-ssh']) {
          sh '''
            REPO_SOURCE_DIR=build-result/p2.repository
            # read properties from promote.properties & publisher.properties
            VERSION=$($SCRIPTS/get_property.sh build-result/publisher.properties version)
            BUILD_ID=$($SCRIPTS/get_property.sh build-result/promote.properties build.id)
            BUILD_TYPE=$($SCRIPTS/get_build_type.sh $BUILD_ID)

            DROP_DIR=$DOWNLOAD_AREA/$VERSION/$BUILD_ID


            cp git-repo/maven/org.eclipse.emf.mwe2.repository/target/repository/*.properties build-result/
            
            #
            # STEP 1: Get property values from publisher.properties/promote.properties
            #
            # read properties from promote.properties & publisher.properties
            VERSION=$($SCRIPTS/get_property.sh build-result/publisher.properties version)
            BUILD_ID=$($SCRIPTS/get_property.sh build-result/promote.properties build.id)
            BUILD_TYPE=$($SCRIPTS/get_build_type.sh $BUILD_ID)
            DROP_DIR=$DOWNLOAD_AREA/$VERSION/$BUILD_ID
            
            #
            # STEP 2: move built repository to 'build-result' directory
            #
            #cp -R git-repo/maven/org.eclipse.emf.mwe2.parent/target/apidocs/* build-result/javadoc
            mv git-repo/maven/org.eclipse.emf.mwe2.repository/target/repository build-result/p2.repository
            mv git-repo/maven/org.eclipse.emf.mwe2.repository/target/emft-mwe-2-lang-Update-$BUILD_ID.zip build-result/downloads/

            case "$BUILD_TYPE" in
              N) # Nightly
                REPO_TARGET_DIR=$PROJECT_STORAGE_PATH/updates/nightly
                ;;
              S) # Stable
                REPO_TARGET_DIR=$PROJECT_STORAGE_PATH/updates/milestones/$BUILD_ID
                ;;
              R) # Release
                REPO_TARGET_DIR=$PROJECT_STORAGE_PATH/updates/releases/$VERSION
                # rename release version: BUILD_ID => VERSION
                mv build-result/downloads/emft-mwe-2-lang-Update-$BUILD_ID.zip build-result/downloads/emft-mwe-2-lang-Update-$VERSION.zip
                ;;
            esac
            #
            # STEP 3: make sure p2 repository exists, cleanup and copy repo to there
            #
            ssh -x genie.mwe@projects-storage.eclipse.org mkdir -p $REPO_TARGET_DIR
            ssh -x genie.mwe@projects-storage.eclipse.org rm -rf $REPO_TARGET_DIR/*
            scp -r $REPO_SOURCE_DIR/* genie.mwe@projects-storage.eclipse.org:$REPO_TARGET_DIR

            #
            # STEP 4: make sure that drop directory exists, cleanup and copy zipped repo to there
            #
            ssh -x genie.mwe@projects-storage.eclipse.org mkdir -p $DROP_DIR
            ssh -x genie.mwe@projects-storage.eclipse.org rm -rf $DROP_DIR/*
            scp build-result/downloads/emft-mwe-*.zip genie.mwe@projects-storage.eclipse.org:$DROP_DIR/
            
            #
            # STEP 5: Recreate compositeArtifacts.xml & compositeContent.xml
            #
            case "$RELEASE_TYPE" in
              Integration) ;;
              GA) # Release
                ssh genie.mwe@projects-storage.eclipse.org 'cat | /bin/bash /dev/stdin' "releases" < $SCRIPTS/create_composite_update_site.sh ;;
              *) # Stable
                ssh genie.mwe@projects-storage.eclipse.org 'cat | /bin/bash /dev/stdin' "milestones" < $SCRIPTS/create_composite_update_site.sh ;;
            esac
          '''
        } // END sshagent
      } // END steps
      post {
        success {
          archiveArtifacts artifacts: 'build-result/**'
        }
      }
    } // END stage
  }

  post {
    always {
      junit testResults: '**/surefire-reports/*.xml'
    }
    cleanup {
      script {
        def curResult = currentBuild.currentResult
        def lastResult = 'NEW'
        if (currentBuild.previousBuild != null) {
          lastResult = currentBuild.previousBuild.result
        }

        if (curResult != 'SUCCESS' || lastResult != 'SUCCESS') {
          def color = ''
          switch (curResult) {
            case 'SUCCESS':
              color = '#00FF00'
              break
            case 'UNSTABLE':
              color = '#FFFF00'
              break
            case 'FAILURE':
              color = '#FF0000'
              break
            default: // e.g. ABORTED
              color = '#666666'
          }

          slackSend (
            message: "${lastResult} => ${curResult}: <${env.BUILD_URL}|${env.JOB_NAME}#${env.BUILD_NUMBER}>",
            botUser: true,
            channel: 'xtext-builds',
            color: "${color}"
          )
        }
      }
    }
  }

}