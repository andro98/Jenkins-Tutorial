pipeline {
    agent any

    stages {
        stage("build") {
            steps {
                sh "chmod +x mvnw"
                sh "./mvnw package"
            }
        }
        stage("capture") {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', followSymlinks: false
                jacoco()
                junit stdioRetention: '', testResults: '**/target/surefire-reports/TEST*.xml'
            }
        }
    }
    post{
        always {
            echo "Done"
        }
    }
}