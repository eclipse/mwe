pipeline {
  agent {
    kubernetes {
      inheritFrom 'centos-8'
    }
  }

  parameters {
    choice(name: 'RELEASE_TYPE', choices: ['milestones', 'releases'])
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
  }

  stages {
    stage('Prepare') {
      steps {
        dir ('git-repo') {
          checkout scm
        }
      } // END steps
    } // END stage


    stage ('Publish') {
      steps {
        sshagent(['projects-storage.eclipse.org-bot-ssh']) {
          sh '''
            ssh genie.mwe@projects-storage.eclipse.org 'cat | /bin/bash /dev/stdin' "$RELEASE_TYPE" < $SCRIPTS/create_composite_update_site.sh
          '''
        } // END sshagent
      } // END steps
    } // END stage
  }
}
