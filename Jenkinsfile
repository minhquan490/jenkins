//pipeline {
//  agent any
//  stages {
//    stage('Check commit message') {
//      steps {
//        script {
//          def commitMsg = sh(script: 'git log -1 --pretty=%B ${GIT_COMMIT}', returnStdout: true).trim()
//
//          // Check last commit
//          if (!commitMsg.startsWith('JEN-')) {
//            error('Commit msg must start with JEN-')
//          }
//        }
//      }
//    }
//    // create job with three or two params
//    stage('Build') {
//      steps {
//        sh './gradlew clean build'
//      }
//    }
//
//  }
//}

listView('project-A') {
  description('All unstable jobs for project A')
  filterBuildQueue()
  filterExecutors()
  jobs {
    name('release-projectA')
    regex(/project-A-.+/)
  }
  jobFilters {
    status {
      status(Status.UNSTABLE)
    }
  }
  columns {
    status()
    weather()
    name()
    lastSuccess()
    lastFailure()
    lastDuration()
    buildButton()
  }
}