    
FROM maven:latest as base
WORKDIR /build
COPY . .
RUN mvn clean 
RUN mvn package
FROM java:8
WORKDIR /opt/app
COPY --from=base /build/target/BeholderCore-0.0.1-SNAPSHOT.jar core.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "core.jar"]
