FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-11-jdk
COPY target/CalculatorMiniApplication-0.0.1-SNAPSHOT.jar /
CMD ["java", "-jar", "CalculatorMiniApplication-0.0.1-SNAPSHOT.jar"]
