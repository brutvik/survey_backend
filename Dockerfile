FROM ubuntu
RUN apt-get update && apt-get install -y openjdk-17-jdk
RUN mkdir target

COPY demo/target/demo-0.0.1-SNAPSHOT.jar /target

CMD ["/usr/bin/java", "-jar", "/target/demo-0.0.1-SNAPSHOT.jar"]



EXPOSE 8080