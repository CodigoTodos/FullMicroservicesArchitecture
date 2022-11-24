FROM openjdk:11
ARG JAR_FIlE=target/*.jar
COPY ${JAR_FIlE} configserver.jar
ENTRYPOINT ["java","-jar","/configserver.jar"]
EXPOSE 9296