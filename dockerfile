FROM openjdk:17.0.12

COPY ps-zapier-svc-0.0.1-SNAPSHOT.jar ps-zapier-svc-0.0.1-SNAPSHOT.jar 

EXPOSE 8080  

ENTRYPOINT ["java", "-jar", "ps-zapier-svc-0.0.1-SNAPSHOT.jar"] 
