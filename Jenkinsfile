pipeline {
  agent any
  stages {
    stage('Check commit message') {
      steps {
        scripts {
          def commitMsg = sh (script: 'git log -1 --pretty=%B ${GIT_COMMIT}', returnStdout: true).trim()

          // Check project code
          if (!commitMsg.startWith('JEN-')) {
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