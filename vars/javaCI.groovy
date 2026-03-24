def call() {

    stage('Clean Workspace') {
        cleanWs()
    }

    stage('Checkout Code') {
        checkout scm
    }

    stage('Compile Code') {
        sh 'mvn clean compile'
    }
}
