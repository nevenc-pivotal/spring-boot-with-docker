# spring-boot-with-docker

## Package
* `mvn package`
* `mvn package -DskipTests`

## Run
* `mvn package -DskipTests && java -jar target/spring-boot-with-docker-0.0.1-SNAPSHOT.jar`

## Build a Docker Image (with Maven)
* `mvn package docker:build`
  * Make sure your `docker-machine` is running.
  * Be patient, first time you run this Docker build, it might take a while to download all the images.

## Publish Image to Docker Hub
* `docker push nevenc/spring-boot-with-docker`
  * You can update your own Docker Hub repository, by changing an attribute in `pom.xml`
  
## Run Docker Image Locally
* `docker run -p 8080:8080 -t nevenc/spring-boot-with-docker`
* `docker run -e "SPRING_PROFILES_ACTIVE=prod" -p 8080:8080 -t nevenc/spring-boot-with-docker`
* `docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8080:8080 -t nevenc/spring-boot-with-docker`

## Run Docker Image on PCF
* `cf push spring-boot-with-docker -o nevenc/spring-boot-with-docker`


