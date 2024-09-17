pipeline {
  agent any
  stages {
    stage('Check commit message') {
      steps {
        script {
          def commitMsg = sh(script: 'git log -1 --pretty=%B ${GIT_COMMIT}', returnStdout: true).trim()

          // Check project code
          if (!commitMsg.startsWith('JEN-')) {
            error('Commit msg must start with JEN-')
          }
        }
      }
    }
    stage('Build') {
      steps {
        sh './gradlew clean build'
      }
    }

  }
}