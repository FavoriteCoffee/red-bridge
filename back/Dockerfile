FROM maven:3.8.5-openjdk-17

WORKDIR /back
COPY . .
RUN mvn clean install -DskipTests
EXPOSE 8080
CMD mvn spring-boot:run