# cambios-tp-ing-software-utn
Just a demo repo for jenkins pipeline testing proposes


# Buildear el proyecto (la versión de gradle debe ser menor a la 7)
docker run \
  --rm \
  -u gradle \
  -v "$PWD":/home/gradle/project \
  -w /home/gradle/project \
  gradle:6.9.1-jdk11-alpine gradle build


# Comando para corregir el build en caso de error `Task :spotlessJavaCheck FAILED`
docker run \
  --rm \
  -u gradle \
  -v "$PWD":/home/gradle/project \
  -w /home/gradle/project \
  gradle:6.9.1-jdk11-alpine gradle :spotlessApply

a)
# Modificaciones en archivos de gradle para usar sonarqube
Documentación: https://sonarqube.inria.fr/sonarqube/documentation/analysis/scan/sonarscanner-for-gradle/

En `gradle.properties`:
```
systemProp.sonar.host.url=http://sonarqube:9000

```

En `build.gradle`:
```
plugins {
  id "org.sonarqube" version "2.7"
}
```

# Comando para correr sonarqube
docker run \
  --rm \
  -u gradle \
  -v "$PWD":/home/gradle/project \
  -w /home/gradle/project \
  --net=cambios-tp-ing-software-utn_default \
  gradle:6.9.1-jdk11-alpine gradle sonarqube -Dsonar.host.url=http://sonarqube:9000 -Dsonar.login=6281939a41098fde290eb918b6e6b60df0dc5598

> Nota: hay que generar un token desde SonarQube, en User > My Account > Security > Generate Token

