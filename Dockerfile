FROM openjdk:8
ADD target/docker-demo-api.jar docker-demo-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-demo-api.jar"]