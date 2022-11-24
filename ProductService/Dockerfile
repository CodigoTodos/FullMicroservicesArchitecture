FROM openjdk:11
ARG JAR_FIlE=target/*.jar
COPY ${JAR_FIlE} productservice.jar
ENTRYPOINT ["java","-jar","/productservice.jar"]
EXPOSE 8080