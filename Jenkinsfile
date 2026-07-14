pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/acaceresduoc/jenkins-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'sudo docker build -t jenkins-demo .'
            }
        }

        stage('Run Docker') {
            steps {
                sh '''
                sudo docker rm -f jenkins-demo || true
                sudo docker run -d --name jenkins-demo -p 8080:8080 jenkins-demo
                '''
            }
        }
    }
}