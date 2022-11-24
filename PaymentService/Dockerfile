FROM openjdk:11
ARG JAR_FIlE=target/*.jar
COPY ${JAR_FIlE} paymentservice.jar
ENTRYPOINT ["java","-jar","/paymentservice.jar"]
EXPOSE 8081