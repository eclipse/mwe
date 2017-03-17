// Tell Jenkins how to build projects from this repository
node {
    try {
        properties([
            [$class: 'BuildDiscarderProperty', strategy: [$class: 'LogRotator', numToKeepStr: '15']]
        ])
        
        stage 'Checkout'
        checkout scm
        
        dir('build') { deleteDir() }
        dir('.m2/repository/org/eclipse/emf/mwe') { deleteDir() }
        dir('.m2/repository/org/eclipse/emf/mwe2') { deleteDir() }
        
        stage 'Maven Build'
        def workspace = pwd()
        def mvnHome = tool 'M3'
        env.M2_HOME = "${mvnHome}"
        try {
            wrap([$class:'Xvnc', useXauthority: true]) {
                sh "cd maven; ${mvnHome}/bin/mvn -f org.eclipse.emf.mwe2.parent/pom.xml --batch-mode --update-snapshots -fae -Dmaven.repo.local='${workspace}/.m2/repository' -Dtycho.localArtifacts=ignore clean install; ${mvnHome}/bin/mvn -f org.eclipse.emf.mwe2.parent/pom.xml --batch-mode -fae -Dmaven.repo.local='${workspace}/.m2/repository' -DskipTests -Dtycho.localArtifacts=ignore -DaltDeploymentRepository='local::default::file:${workspace}/build/maven-repo' deploy"
            }
        } finally {
            step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/*.xml'])
        }
        archive 'maven/org.eclipse.emf.mwe2.repository/target/repository/**'
        archive 'build/**'
        
        if (currentBuild.result == 'UNSTABLE') {
            slackSend color: 'warning', message: "Build Unstable - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
        } else {
            slackSend color: 'good', message: "Build Succeeded - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
        }
    } catch (e) {
        slackSend color: 'danger', message: "Build Failed - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
        throw e
    }
}
