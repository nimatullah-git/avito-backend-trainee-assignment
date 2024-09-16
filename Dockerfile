FROM openjdk:17-jdk-alpine
LABEL authors="nimatullah"

WORKDIR /app

COPY build.gradle settings.gradle ./
COPY gradle ./gradle

RUN ./gradlew build --no-daemon

COPY . .

RUN ./gradlew bootJar --no-daemon

EXPOSE 8080

CMD ["java", "-jar", "build/libs/avito-backend-trainee-assignment-0.0.1-SNAPSHOT.jar"]
