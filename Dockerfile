FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/app.jar app.jar
RUN addgroup appusers && adduser -S appuser -G appusers
USER appuser:appusers
ENTRYPOINT ["java","-jar","/app/app.jar"]