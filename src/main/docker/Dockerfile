FROM openjdk:8
COPY target/pulse-tcp-1.0-SNAPSHOT.jar /usr/src/myapp/app.jar
WORKDIR /usr/src/myapp/
CMD ["java","-jar","/app.jar"]