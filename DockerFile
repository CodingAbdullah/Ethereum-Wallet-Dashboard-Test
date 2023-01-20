FROM maven:3.6.3-jdk-11 as build

# Using maven base image, copy the dependenices of the pom.xml file and adding them to project using the mvn command
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ /usr/src/app/src/
RUN mvn package -DskipTests

# Add your custom path here for the .jar file
FROM openjdk:11-jre
COPY --from=build /usr/src/app/target/Ethereum_W_Dashboard.jar /usr/Ethereum_Wallet_Dashboard_Test/Ethereum_W_Dashboard_Test.jar

CMD ["java", "-jar", "/usr/Ethereum-Wallet-Dashboard-Test/Ethereum_W-Dashboard_Test.jar"]
