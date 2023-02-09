FROM openjdk:17-jdk-slim-buster
EXPOSE 8081
ADD target/spring-boot-meeting.jar spring-boot-meeting.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-meeting.jar"]