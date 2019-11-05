FROM openjdk:11
WORKDIR /usr/src
ADD target/spring-eureka-service-0.0.1-SNAPSHOT.jar /usr/src/spring-eureka-service-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/usr/src/spring-eureka-service-0.0.1-SNAPSHOT.jar"]