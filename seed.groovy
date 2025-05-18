// seed.groovy
pipelineJob('sample-pipeline') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/RoadieHQ/sample-service.git')
          }
          branch('main')
        }
      }
      scriptPath('dummy-Jenkinsfile')
    }
  }
}
