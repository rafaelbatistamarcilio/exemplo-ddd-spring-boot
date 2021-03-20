FROM adoptopenjdk/openjdk11:latest

COPY target/exemploddd-*.jar app.jar

CMD ["java", "-jar" ,"./app.jar"]