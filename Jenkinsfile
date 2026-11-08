pipeline {
    agent any

    tools {
        jdk 'jdk-25'
    }

    options {
        timestamps()
        timeout(time: 45, unit: 'MINUTES')
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '5'))
    }

    environment {
        GRADLE = 'gradlew.bat --console=plain --stacktrace'
    }

    stages {
        stage('Hello') {
            steps {
                cleanWs()
                echo "Building ${env.JOB_NAME} #${env.BUILD_NUMBER} on ${env.NODE_NAME}"
                bat 'java -version'
                bat 'git log -1 --oneline'
            }
        }
    }

}

