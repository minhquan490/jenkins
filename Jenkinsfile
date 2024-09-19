pipeline {
  agent {
    docker
  }
  parameters {
    string(name: 'BRANCH_NAME', defaultValue: 'main', description: 'Branch to build')
    choice(name: 'ENVIRONMENT', choices: ['Development', 'Testing', 'Production'], description: 'Select the environment')
    string(name: 'JDBC_URL', defaultValue: '', description: 'Jdbc url')
  }
  stages {
    stage('Build') {
      steps {
        sh 'docker build'
      }
    }

  }
}