FROM openjdk:11-jdk-slim

COPY ./build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "-Dspring.profiles.active=prod", "app.jar" ]

