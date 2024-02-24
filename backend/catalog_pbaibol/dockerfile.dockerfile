
FROM openjdk:17
MAINTAINER xpulvi
EXPOSE 8080
#COPY target/docker-java-jar-0.0.1-SNAPSHOT.jar test_doc.jar
#COPY src/main/java/com/manager_pbaibol  /app

#CMD ["java", "-javac", "ManagerPbaibolApplication.java"]

COPY  target/catalog_pbaibol-0.1.1-SNAPSHOT.jar /app/catalog_pbaibol-0.1.1-SNAPSHOT.jar

WORKDIR /app

#CMD java org.example.Main.java

CMD ["java", "-jar", "catalog_pbaibol-0.1.1-SNAPSHOT.jar"]

#ENTRYPOINT ["java","-jar","/ManagerPbaibolApplication.java"]

