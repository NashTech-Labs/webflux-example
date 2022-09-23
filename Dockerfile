FROM openjdk:8
ARG JAR_FILE=target/webflux-0.0.1.jar
ADD  ${JAR_FILE} /webflux-0.0.1.jar
ENTRYPOINT exec java -jar webflux-0.0.1.jar
