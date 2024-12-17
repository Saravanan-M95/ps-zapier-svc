# Use an official Maven image to build the app
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Use an official Java runtime as a parent image
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/ps-zapier-svc-0.0.1-SNAPSHOT.jar app.jar

# Inform Docker that the container listens on the specified port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]