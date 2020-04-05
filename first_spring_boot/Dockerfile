FROM maven:3.6-jdk-8 AS maven

COPY . /build

#RUN java -version

#RUN mvn -version

RUN cd /build && mvn clean install -DskipTests

FROM openjdk:8

WORKDIR /app

COPY --from=maven /build/target/first-spring.jar /app/

CMD ["java", "-jar", "first-spring.jar"]




