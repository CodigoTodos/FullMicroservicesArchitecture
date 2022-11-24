FROM openjdk:11
ARG JAR_FIlE=target/*.jar
COPY ${JAR_FIlE} serviceregistry.jar
ENTRYPOINT ["java","-jar","/serviceregistry.jar"]
EXPOSE 8761