EXPOSE 8080
FROM amazoncorretto:11-alpine-jdk
MAINTAINER NJVP
COPY target/njvp-0.0.1-SNAPSHOT.jar njvp-app.jar
ENTRYPOINT ["java", "-jar", "/njvp-app.jar"]
