FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN cd taskitem && ./mvnw clean package -DskipTests


EXPOSE 8080

CMD ["java", "-jar", "target/taskitem-0.0.1-SNAPSHOT.jar"]
