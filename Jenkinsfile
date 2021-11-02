pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Colonar repo'
        git(url: 'https://github.com/clbaldino/cambios-tp-ing-software-utn', branch: 'main')
        sh 'git pull https://github.com/clbaldino/cambios-tp-ing-software-utn'
        sh 'git checkout main'
        echo 'Compilar con gradle'
        sh 'gradle build'
      }
    }

  }
}