FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY  ${JAR_FILE} estore.jar

ENTRYPOINT ["java", "-jar", "/estore.jar"]

