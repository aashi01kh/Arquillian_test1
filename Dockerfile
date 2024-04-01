FROM openjdk:11



COPY target/testthearquillianfirst-0.0.1-SNAPSHOT.jar atest
EXPOSE 8080
CMD ["java", "-jar", "/atest"]

