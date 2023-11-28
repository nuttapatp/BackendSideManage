# Use an OpenJDK base image that matches your Java version
FROM eclipse-temurin:20-jdk as build

# Set the working directory in the Docker container
WORKDIR /app

# Copy the Maven wrapper from the host to the container
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml and source code
COPY pom.xml .
COPY src src

# Build the application using the Maven wrapper
RUN ./mvnw clean package -DskipTests

# Start with a new, clean base image to run your application
FROM eclipse-temurin:20-jdk

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar /app/app.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java","-jar","/app/app.jar"]
