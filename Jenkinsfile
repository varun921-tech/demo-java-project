pipeline {
  agent any
  stages {
    stage('Checkout and Build') {
      parallel {
        stage('Build') {
          steps {
            git(credentialsId: 'f4708822-3927-49ed-a7c7-99f3573cb18f', branch: 'integration', url: 'https://github.com/varun921-tech/demo-java-project.git')
          }
        }

        stage('Compile') {
          steps {
            withMaven(maven: 'maven3.8.7') {
              sh 'mvn compile'
            }

          }
        }

      }
    }

    stage('Unit Tests') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Package') {
      steps {
        sh 'mvn package'
      }
    }

    stage('Results') {
      parallel {
        stage('Results') {
          steps {
            junit '**/*.xml'
          }
        }

        stage('error') {
          steps {
            archiveArtifacts '**/*.war'
          }
        }

      }
    }

  }
}