pipeline {
  agent any
  stages {
    // create job with three or two params
    stage('Build') {
      steps {
        sh './gradlew clean build'
      }
    }

  }
}