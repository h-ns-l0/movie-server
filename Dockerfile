# 1. 자바 17 환경을 기반으로 함->이클립스 테무린(Eclipse Temurin)수정
FROM eclipse-temurin:17-jdk

# 2. 작업 디렉토리 설정
WORKDIR /app

# 3. 프로젝트 파일 복사
COPY . .

# 4. gradlew 실행 권한 부여 및 빌드 (리눅스 환경 대비)
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

# 5. 빌드된 jar 파일을 실행
# (build/libs 안에 생성된 jar 파일을 실행합니다. 파일명 패턴 주의)
CMD ["java", "-jar", "build/libs/movie-server-0.0.1-SNAPSHOT.jar"]