listView('Example View') {
    description('This is a list view created from a DSL script in Git')
    jobs {
        name('build-job')
    }
    columns {
        buildParameters()
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
        git('https://github.com/minhquan490/jenkins.git', 'master')
    }
    steps {
        shell('echo "Running build script..."')
    }
    environmentVariables {
        env('jdbc-url', 'url')
    }
}