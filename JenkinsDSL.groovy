job('springProjectDSL') {
    description("SpringProject job using Jenkins DSL.")
    scm {
        git('https://github.com/nikhiljanti/springProject.git', 'master')
    }
    steps {
        maven ('install package')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}