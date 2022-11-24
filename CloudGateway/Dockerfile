FROM openjdk:11
ARG JAR_FIlE=target/*.jar
COPY ${JAR_FIlE} cloudgateway.jar
ENTRYPOINT ["java","-jar","/cloudgateway.jar"]
EXPOSE 9090