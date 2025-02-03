# Use OpenJDK 23 base image
FROM openjdk:23-jdk-slim

# Set working directory inside the container
WORKDIR /app-docker

# Copy the application JAR file into the container
COPY target/*.jar app-docker.jar

# Expose the port your Spring Boot app runs on
EXPOSE 9998

# Command to run the application
ENTRYPOINT ["java", "-jar", "app-docker.jar"]