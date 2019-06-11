#!/usr/bin/groovy
pipeline {
    agent any
   
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
		sh 'mvn clean install'
            }
        }
    }
}
