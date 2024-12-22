FROM openjdk:17
WORKDIR /app
COPY target/MavenSampleApp-1.0-SNAPSHOT.jar MavenSampleApp-1.0-SNAPSHOT.jar
EXPOSE 9000
CMD ["java", "-jar", "MavenSampleApp-1.0-SNAPSHOT.jar", "&&", "tail", "-f", "/dev/null"]