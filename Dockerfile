FROM openjdk:8-jdk-slim
WORKDIR /app
COPY target/Myms-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
