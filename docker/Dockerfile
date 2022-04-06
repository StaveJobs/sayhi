FROM openjdk:17-jdk

WORKDIR /app
COPY target/sayhi-*-SNAPSHOT.jar app.jar

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dserver.port=1001","/app/app.jar"]