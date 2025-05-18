// seed.groovy
pipelineJob('sample-pipeline') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rkokkiri76/dsl-jobs.git')
          }
          branch('main')
        }
      }
      scriptPath('jenkinsfile')
    }
  }
}
