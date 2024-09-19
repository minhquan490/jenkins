// Example DSL script located in: scripts/job-dsl.groovy

listView('Example View') {
    description('This is a list view created from a DSL script in Git')
    jobs {
        name('build-job')
        name('test-job')
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

job('build-job') {
    description('This is a build job created from Job DSL')
    scm {
        git('https://github.com/your-repo/build-job.git', 'main')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        shell('echo "Running build script..."')
    }
}

job('test-job') {
    description('This is a test job created from Job DSL')
    scm {
        git('https://github.com/your-repo/test-job.git', 'main')
    }
    steps {
        shell('echo "Running test script..."')
    }
}
