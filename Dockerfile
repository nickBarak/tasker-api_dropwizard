# build stage

FROM maven:latest AS build

COPY pom.xml pom.xml

COPY config.yaml config.yaml

COPY src src

RUN mvn clean verify


# package stage

FROM openjdk:latest

COPY --from=build target/taskerapi-1.0-SNAPSHOT.jar tasker-api.jar

EXPOSE 8081

EXPOSE 8082

CMD ["java", "-jar", "tasker-api.jar", "server", "config.yaml"]