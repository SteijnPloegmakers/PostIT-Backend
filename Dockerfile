FROM maven:3.8.2-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/PostIT-0.0.1.jar /usr/local/lib/PostIT.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","/usr/local/lib/PostIT.jar"]