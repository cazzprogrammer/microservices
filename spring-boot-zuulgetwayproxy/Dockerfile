FROM openjdk:11
WORKDIR /usr/src
ADD target/spring-boot-zuulgetwayproxy-0.0.1-SNAPSHOT.jar  /usr/src/spring-boot-zuulgetwayproxy-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar", "/usr/src/spring-boot-zuulgetwayproxy-0.0.1-SNAPSHOT.jar"]
