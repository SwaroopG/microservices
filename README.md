# Project Microservices
![Architecture](/microservices-demo/src/main/resources/static/dist/img/architecture.jpg )

## Project Structure
This project has 3 different modules. Each can be run independently on their own.
  1. user-services      - configured to run on port 8400
  2. library-services   - configured to run on port 8500
  3. microservices-demo - configured to run on port 8300
  4. eureka-server      - configured to run on port 8761

## Building the project
At the module level, run the following 
**gradle clean build**

## Running the project
At the project level, run the following
**gradle clean bootrun**

**Note**: This should build the project and package the archive to build/libs/ folder.

## Running the Application from Jar
**java -jar build/libs/library-services-1.0-SNAPSHOT.jar**

**Note**: Assuming that your archive is created in build/libs/ folder.

## Build & Run
**gradle clean build && java -jar build/libs/library-services-1.0-SNAPSHOT.jar**

