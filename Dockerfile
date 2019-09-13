FROM openjdk:8
ADD build/libs/gs-spring-boot-docker-0.1.0.jar add.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "add.jar"]