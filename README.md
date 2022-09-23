This is a simple example how you can use spring boot + mongodb + docker to create a REST api using spring webflux. Any suggestions, new
features or corrections are welcome!
# Spring webflux
Reactor is the reactive library of choice for Spring WebFlux. It provides the Mono and Flux API types to work on data.

Ref link: https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html

# System requirements

    Open JDK 8
    Maven
    Docker
# Clone Project
```
Clone git@github.com:knoldus/restAPI-using-webflux.git and import project
mvn clean install
docker-compose up --build
```

# Test API from swagger UI
```
http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/#
```
# To verify mongodb collection
```
sudo su 
mongo
show dbs
use eb
eb.user.find()
```