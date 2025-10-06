FROM eclipse-temurin:21-jre AS build

WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app.jar

RUN java -Djarmode=layertools -jar /app.jar extract

#---
FROM eclipse-temurin:21-jre

WORKDIR /app
COPY --from=build /app/dependencies/ ./
COPY --from=build /app/spring-boot-loader/ ./
COPY --from=build /app/snapshot-dependencies/ ./
COPY --from=build /app/application/ ./

ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]
