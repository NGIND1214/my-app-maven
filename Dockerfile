FROM openjdk:8
 
# copy the packaged jar file into our docker image
COPY target/my-app-9.0.jar /my-app.jar
 
# set the startup command to execute the jar
CMD ["java", "-jar", "/my-app.jar"]



