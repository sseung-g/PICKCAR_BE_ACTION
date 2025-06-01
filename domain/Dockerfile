# 1) Build stage
FROM eclipse-temurin:21-jdk AS builder
WORKDIR /app

COPY settings.gradle build.gradle gradlew ./
COPY gradle gradle

RUN chmod +x ./gradlew

# 의존성 캐시 레이어
RUN ./gradlew :domain:compileJava -x test --no-daemon

COPY domain domain

RUN ./gradlew :domain:build -x test --no-daemon

# 2) Runtime stage
FROM eclipse-temurin:21-jre
WORKDIR /app

COPY --from=builder /app/domain/build/libs/domain-*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]