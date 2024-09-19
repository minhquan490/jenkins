listView('Example View') {
    description('This is a list view created from a DSL script in Git')
    jobs {

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