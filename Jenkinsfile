pipeline {
  agent any
  stages {
    stage('Check commit message') {
      steps {
        script {
          def commitMsg = sh(script: 'git log -1 --pretty=%B ${GIT_COMMIT}', returnStdout: true).trim()

          // Check last commit
          if (!commitMsg.startsWith('JEN-')) {
            error('Commit msg must start with JEN-')
          }
        }
      }
    }
    // create job with three or two params
    stage('Build') {
      steps {
        sh './gradlew clean build'
      }
    }

  }
}