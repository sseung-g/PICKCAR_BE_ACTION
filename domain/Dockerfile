# 1) Build stage: OpenJDK 베이스 이미지 + Gradle Wrapper 사용
FROM eclipse-temurin:21-jdk AS builder
WORKDIR /app

# 루트 Gradle 설정 파일과 Gradle Wrapper 복사
COPY settings.gradle build.gradle gradlew ./
COPY gradle gradle

# domain 소스만 복사
COPY domain domain

# 권한 문제 방지용 (gradlew 실행권한 부여)
RUN chmod +x ./gradlew

# domain 모듈 빌드 (테스트 생략)
RUN ./gradlew :domain:build -x test

# 2) Runtime stage: JRE 베이스 이미지
FROM eclipse-temurin:21-jre
WORKDIR /app

# 빌드된 JAR 복사
COPY --from=builder /app/domain/build/libs/domain-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]