pipeline {
    agent any

    tools {
        maven 'mvn01' // Usa la configuración de Maven que añadiste
    }

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
            cleanWs() // Limpia el workspace después de cada ejecución
        }
        failure {
            echo 'Build failed!'
        }
        success {
            echo 'Build succeeded!'
        }
    }
}
