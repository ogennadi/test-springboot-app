FROM amazoncorretto:17-alpine-jdk
RUN apk --no-cache add curl
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]