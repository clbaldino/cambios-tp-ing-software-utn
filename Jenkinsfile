pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Clonar repo'
        git(url: 'https://github.com/clbaldino/cambios-tp-ing-software-utn', branch: 'main')
        sh 'git pull https://github.com/clbaldino/cambios-tp-ing-software-utn'
        sh 'git checkout main'
        echo 'Compilar con gradle'
        catchError() {
          sh './gradlew build'
        }

        echo 'Ejecutar servidor'
        sh '''export BUILD_ID=dontKillMe
export SERVER_PORT=8888
nohup ./gradlew bootRun > $WORKSPACE/server.output 2>&1 &'''
        sleep 20
        sh 'tail $WORKSPACE/server.output'
      }
    }

  }
}