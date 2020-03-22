FROM openjdk:8
ADD target/dockerSpringRest.jar dockerSpringRest.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "dockerSpringRest.jar"]