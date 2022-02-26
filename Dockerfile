FROM openjdk:latest
COPY ./target/SET08803-Group1-1.0.0.0-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "SET08803-Group1-1.0.0.0-jar-with-dependencies.jar"]


