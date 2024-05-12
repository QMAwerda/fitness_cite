FROM openjdk:11-jdk

WORKDIR /app

COPY . .

CMD ["java", "-jar", "target/Fitness-0.0.1-SNAPSHOT.jar", "com.mirea.optic.FitnessApplication"]