pipeline {
  agent {
    kubernetes {
      inheritFrom 'centos-8'
    }
  }
  
  parameters {
    choice(name: 'RELEASE_TYPE', choices: ['Integration', 'Beta', 'M0', 'M1', 'M2', 'M3', 'RC1', 'RC2', 'GA'], description:
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
    RELEASE_TYPE="$params.RELEASE_TYPE"
    FORCE_PUBLISH="$params.FORCE_PUBLISH"
  }

  stages {
    stage('Prepare') {
      steps {
        dir ('git-repo') {
          checkout scm
        }
        dir ('git-repo-nightly') {
          checkout scm
        }

        sh '''
          # Clean up the build result
          rm -rf build-result/
          mkdir -p build-result/downloads/
          mkdir -p build-result/javadoc/
          mkdir -p build-result/composite/

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
          withMaven(jdk: 'temurin-jdk11-latest', maven: 'apache-maven-3.9.1', options: [junitPublisher(disabled: true), openTasksPublisher(disabled: true)]) {
            dir ('git-repo') {
              buildProject("org.eclipse.emf.mwe2.target")
            }
          }
        }
      } // END steps
      post {
        success {
          archiveArtifacts artifacts: 'git-repo/**/my-local-snapshots-dir/**, git-repo/**/maven/org.eclipse.emf.mwe2.repository/target/repository/**, git-repo/**/maven/org.eclipse.emf.mwe2.repository/target/emft-mwe-2-lang-Update-*.zip'
        }
      }
    } // END stage

    stage ('Build Nightly') {
      steps {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
          catchError(buildResult: 'UNSTABLE', stageResult: 'UNSTABLE') {
            withMaven(jdk: 'temurin-jdk17-latest', maven: 'apache-maven-3.9.1', options: [junitPublisher(disabled: true), openTasksPublisher(disabled: true)]) {
              dir ('git-repo-nightly') {
                buildProject("org.eclipse.emf.mwe2.target.nightly", true)
              }
            }
          }
        }
      } // END steps
    } // END stage

    stage ('Build Nightly1') {
      steps {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
          catchError(buildResult: 'UNSTABLE', stageResult: 'UNSTABLE') {
            withMaven(jdk: 'temurin-jdk17-latest', maven: 'apache-maven-3.9.1', options: [junitPublisher(disabled: true), openTasksPublisher(disabled: true)]) {
              dir ('git-repo-nightly1') {
                buildProject("org.eclipse.emf.mwe2.target.nightly", true)
              }
            }
          }
        }
      } // END steps
    } // END stage

    stage ('Build Nightly2') {
      steps {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
          catchError(buildResult: 'UNSTABLE', stageResult: 'UNSTABLE') {
            withMaven(jdk: 'temurin-jdk17-latest', maven: 'apache-maven-3.9.1', options: [junitPublisher(disabled: true), openTasksPublisher(disabled: true)]) {
              dir ('git-repo-nightly2') {
                buildProject("org.eclipse.emf.mwe2.target.nightly", true)
              }
            }
          }
        }
      } // END steps
    } // END stage

    stage ('Build Nightly3') {
      steps {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
          catchError(buildResult: 'UNSTABLE', stageResult: 'UNSTABLE') {
            withMaven(jdk: 'temurin-jdk17-latest', maven: 'apache-maven-3.9.1', options: [junitPublisher(disabled: true), openTasksPublisher(disabled: true)]) {
              dir ('git-repo-nightly3') {
                buildProject("org.eclipse.emf.mwe2.target.nightly", true)
              }
            }
          }
        }
      } // END steps
    } // END stage

    stage ('Build Nightly4') {
      steps {
        wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
          catchError(buildResult: 'UNSTABLE', stageResult: 'UNSTABLE') {
            withMaven(jdk: 'temurin-jdk17-latest', maven: 'apache-maven-3.9.1', options: [junitPublisher(disabled: true), openTasksPublisher(disabled: true)]) {
              dir ('git-repo-nightly4') {
                buildProject("org.eclipse.emf.mwe2.target.nightly", true)
              }
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
            # VERSION=$($SCRIPTS/get_property.sh build-result/publisher.properties version)
            # BUILD_ID=$($SCRIPTS/get_property.sh build-result/promote.properties build.id)
            # BUILD_TYPE=$($SCRIPTS/get_build_type.sh $BUILD_ID)

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
                ssh genie.mwe@projects-storage.eclipse.org 'cat | /bin/bash /dev/stdin' "releases" < $SCRIPTS/create_composite_update_site.sh

                # clean up milestone, delete all except for the last 3
                # find directories in the milestone update location, only in one level
                # remove all except for the last 3 ones
                ssh genie.mwe@projects-storage.eclipse.org 'find $PROJECT_STORAGE_PATH/updates/milestones/ -maxdepth 1 -mindepth 1 -type d |sort|head -n -3 | xargs rm -rf'

                # recreate the milestones composite repository
                ssh genie.mwe@projects-storage.eclipse.org 'cat | /bin/bash /dev/stdin' "milestones" < $SCRIPTS/create_composite_update_site.sh;;
              *) # Stable
                ssh genie.mwe@projects-storage.eclipse.org 'cat | /bin/bash /dev/stdin' "milestones" < $SCRIPTS/create_composite_update_site.sh;;
            esac

            ssh genie.mwe@projects-storage.eclipse.org /bin/bash <<-EOF
                # Clean up all nightly drop directories except for the last 5
                for f in \\$(find $DOWNLOAD_AREA -type d -name N* -exec basename {} \\; |sort|head -n -5)
                do 
                    find $DOWNLOAD_AREA -type d -name \\$f -exec rm -rf {} \\; 
                done

                echo "Kept the following nightly drops:"
                find $DOWNLOAD_AREA/ -type d -name N* | sort

                # Clean up all milestone drop directories except for the last 5
                for f in \\$(find $DOWNLOAD_AREA -type d -name S* -exec basename {} \\; |sort|head -n -5)
                do 
                    find $DOWNLOAD_AREA -type d -name \\$f -exec rm -rf {} \\; 
                done

                echo "Kept the following milestone drops:"
                find $DOWNLOAD_AREA/ -type d -name S* | sort
# it is important that the end statement in the next line is at the beginning of the line
EOF
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
      junit allowEmptyResults: true, testResults: '**/surefire-reports/*.xml'
      archiveArtifacts artifacts: '**/target/work/data/.metadata/.log, **/target/work/data/.metadata/bak*.log'
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

           matrixSendMessage https: true,
            hostname: 'matrix.eclipse.org',
            accessTokenCredentialsId: "matrix-token",
            roomId: '!umPMJdXBGeZgeGiPCM:matrix.eclipse.org',
            body: "${lastResult} => ${curResult} ${env.BUILD_URL} | ${env.JOB_NAME}#${env.BUILD_NUMBER}",
            formattedBody: "<div><font color='${color}'>${lastResult} => ${curResult}</font> | <a href='${env.BUILD_URL}' target='_blank'>${env.JOB_NAME}#${env.BUILD_NUMBER}</a></div>"
        }
      }
    }
  }

}

def buildProject(targetPlatform, forceLocalDeployment = false) {
  withEnv(["TARGET_PLATFORM=$targetPlatform", "FORCE_LOCAL_DEPLOYMENT=$forceLocalDeployment"]) {
    sh '''
      GOALS='clean javadoc:aggregate-jar test deploy'
      if [ "${FORCE_LOCAL_DEPLOYMENT}" == "true" ] || [ "${BRANCH_NAME}" != "master" ] && [ "${RELEASE_TYPE}" == "Integration" ] && [ "${FORCE_PUBLISH}" != "true" ]; then
        GOALS="${GOALS} -DaltDeploymentRepository=snapshot-repo::default::file:./my-local-snapshots-dir"
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
        -Dtarget-platform=${TARGET_PLATFORM} \
        -DBUILD_TYPE=$BUILD_TYPE \
        $GOALS
      ls -la
      find . -name "*my-local-snapshots-dir*"
    '''
  }
}