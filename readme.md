# Compiling the Application:
To compile the application, browse to the root of the project and execute:
maven package

# Running the application:
Once compiled, then in target there should be a jar file of the application.
In a command line execute:
java -jar FlashCardMania-0.0.1-SNAPSHOT.jar

This should start spitting out lots of console logging about the application startup.

The Spring Boot application should start listening after startup. 

# Verifying Application is Running
You should be able to use your browser and browse to: http://localhost:8080/api/flash-card/ where you should get a JSON reply.

# NOTE:
I have added a compiled version of the application in the root of the Spring boot project, so you don't have to compile it if you don't want to.
