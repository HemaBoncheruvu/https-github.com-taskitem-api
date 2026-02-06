FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x taskitem/mvnw \
    && cd taskitem \
    && ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "taskitem/target/taskitem-0.0.1-SNAPSHOT.jar"]
