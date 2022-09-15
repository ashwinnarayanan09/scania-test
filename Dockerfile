FROM openjdk:11
EXPOSE 8080
ADD build/libs/demo-0.0.1-SNAPSHOT.jar dockerapp.jar
ENTRYPOINT ["java","-jar","dockerapp.jar"]