FROM openjdk:latest
COPY ./target/SET08803-Group1-0.1.0.1-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "SET08803-Group1-0.1.0.1-jar-with-dependencies.jar"]


