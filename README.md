# map-security-bk
MAP Security Microservice - Authentication and Authorization

### How to run
Download
$ git clone https://github.com/arquitechthor/map-security-bk.git

Install & Run
You can use maven wrapper from Spring Initializr:

$ ./mvnw clean spring-boot:run

Also you can use docker for running the project:

docker build -t security .

then

docker run -p 8000:8000 security

### Technologies
- Spring Boot: 3.2.2
- Java 21