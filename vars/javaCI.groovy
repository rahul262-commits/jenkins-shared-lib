def call() {

    stage('Clean Workspace') {
        cleanWs()
    }

    stage('Checkout Code') {
        git url: 'https://github.com/rahul262-commits/demo-project.git', branch: 'main'
    }

    stage('Compile Code') {
        sh 'mvn clean compile'
    }
}
