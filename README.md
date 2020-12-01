# Uber REST Web Service

Creating a basic REST Web Service was done by using these two similar tutorials.   Since we are expected to develop a service-based method to not only retrieve all users (with GET) but also create a user (with POST), the second one is best IMO. 

[Good Tutorial] https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/griz_jersey_intro/Grizzly-Jersey-Intro.html

[Better Tutorial] https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/basic_grizzly_jersey/jersey-grizzly-json-service.html

# Requirements

Java 8

Java(TM) SE Runtime Environment (build 1.8.0_271-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.271-b09, mixed mode)

Apache Maven 3.6.3

Java version: 1.8.0_101, vendor: Oracle Corporation, runtime: C:\Progra~1\Java\jdk1.8.0_101\jre

Curl 7.73

Release-Date: 2020-10-14

# Build Project

    mvn clean compile
    mvn exec:java
    
This should start the Grizzly/Glassfish server locally with the message:

    Dec 01, 2020 3:48:28 PM org.glassfish.grizzly.http.server.NetworkListener start
    INFO: Started listener bound to [localhost:8080]
    Dec 01, 2020 3:48:28 PM org.glassfish.grizzly.http.server.HttpServer start
    INFO: [HttpServer] Started.
    Jersey app started with WADL available at http://localhost:8080/uber/application.wadl
    Hit enter to stop it...
    
In a seperate window we can run the follwing commands.

To GET all users:

    curl -X GET http://localhost:8080/uber/ubercustomers/all
    
To GET just an ID:

    curl -X GET http://localhost:8080/uber/ubercustomers/100

Since we only go up to 104, try getting 105, we should get a properly formatted JSON error response:

    {"type":"Error","message":"Customer 105 not found"}
    
Now let's add a user:

    curl -X POST -i -H "Content-Type: application/json" -d '{"firstName":"Admin","lastName":"De La Vega","cellphone":"(524) 202-1234","rating":"5.5"}' http://localhost:8080/uber/ubercustomers/add
    
We should now be able to get 105:

    curl -X GET http://localhost:8080/uber/ubercustomers/100
    
With the response:

    {"id":105,"firstName":"Admin","lastName":"De La Vega","cellphone":"(524) 202-1234","rating":"5.5"}

# Resources

I tried to use two different JSON implementations, one from google but ultimately went with what the tutorial suggested, here's Maven dependencies:

        <dependency>
           <groupId>com.google.code.gson</groupId>
           <artifactId>gson</artifactId>
           <version>2.8.6</version>
        </dependency>
        <dependency>
           <groupId>org.glassfish.jersey.media</groupId>
           <artifactId>jersey-media-json-jackson</artifactId>
        </dependency>

Use this link to format the responses:

[JSON pretty print] https://jsonlint.com/




    

    
