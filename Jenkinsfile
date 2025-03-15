pipeline {
    agent any
    stages{
        stage('git checkout'){
            steps{
                git branch: 'master',
                url: 'https://github.com/demuduraviteja/jenkinshandsonmvnproject.git'
            }
        }
        stage('Maven Build'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('Docker Build'){
            steps{
                sh 'docker build -t my-maven-project .'
            }
        }
        stage('Docker Run'){
            steps{
                sh 'docker run -it -d -p 9000:9000 --name my-maven my-maven-project'
            }
        }
    }
}
