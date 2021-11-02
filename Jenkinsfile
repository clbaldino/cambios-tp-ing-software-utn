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
        sh '''docker run \\
  --rm \\
  -u gradle \\
  -v "$PWD":/home/gradle/project \\
  -w /home/gradle/project \\
  gradle:6.9.1-jdk11-alpine gradle build'''
      }
    }

  }
}