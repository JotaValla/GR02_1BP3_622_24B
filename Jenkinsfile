pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Ejecuta Maven clean install
                sh 'mvn clean install'
            }
        }

        stage('Run Application') {
            steps {
                // Ejecuta el JAR generado
                dir('target') {
                    sh 'java -cp ./Calculadora-1.0-SNAPSHOT.jar com.jotacode.CalculatorExecute'
                }
            }
        }
    }

    post {
        always {
            // Limpia el workspace después de la ejecución
            cleanWs()
        }
        failure {
            echo 'Build failed!'
        }
        success {
            echo 'Build succeeded!'
        }
    }
}