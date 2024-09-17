FROM gradle:jdk21-alpine AS gradleBuilder

RUN gradle clean jar --no-daemon

FROM eclipse-temurin:21-alpine

COPY --from=gradleBuilder /app/build/libs/app.jar ./app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]