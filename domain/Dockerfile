# 1) Build 단계: Gradle 환경에서 domain 모듈만 빌드
FROM gradle:8.1-jdk21 AS builder
WORKDIR /app

# 루트 Gradle 설정 파일 가져오기
COPY settings.gradle build.gradle gradlew ./
COPY gradle gradle

# domain 소스만 복사
COPY domain domain

# domain 모듈만 빌드 (테스트 생략)
RUN ./gradlew :domain:build -x test

# 2) Runtime 단계: JDK 21 런타임 사용
FROM eclipse-temurin:21-jre
WORKDIR /app

# 빌드된 JAR 복사
COPY --from=builder /app/domain/build/libs/domain-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]