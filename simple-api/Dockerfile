# -----------------------------------------------------------------------------
# FILE 3: The Dockerfile for the Java Application
# Dockerfile
# Stage 1: Build the application with Maven
FROM maven:3-amazoncorretto-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package -DskipTests

# Stage 2: Create the final, runnable image
FROM amazoncorretto:17-alpine
WORKDIR /app
ADD https://dtdg.co/latest-java-tracer /app/dd-java-agent.jar
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
