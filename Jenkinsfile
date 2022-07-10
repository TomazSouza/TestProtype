pipeline {
  agent any
  stages {
    stage('') {
      steps {
        sh '''if (env.BRANCH_NAME == \'develop\' || env.CHANGE_TARGET == \'develop\') {
					env.BUILD_TYPE = \'debug\'        
				} else if (env.BRANCH_NAME == \'master\' || env.CHANGE_TARGET == \'master\') {
					env.BUILD_TYPE = \'debug\'          
				}'''
        }
      }

    }
    environment {
      APP_NAME = 'test'
    }
  }