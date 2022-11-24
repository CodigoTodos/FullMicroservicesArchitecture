FROM openjdk:11
ARG JAR_FIlE=target/*.jar
COPY ${JAR_FIlE} orderservice.jar
ENTRYPOINT ["java","-jar","/orderservice.jar"]
EXPOSE 8082