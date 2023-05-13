FROM amazoncorretto:8-alpine-jdk
MAINTAINER njvp
COPY target/njvp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080
