# Internal Admin Srvice
This service is a internal service and not exposed on internet.
This service will provide admin credential information.


### To run this application
```java
mvn spring-boot:run
```

### To build docker images of this application
```java
./mvnw package -Pprod -DskipTests jib:dockerBuild
```


### To run docker images of this application
```java
docker-compose -f src/main/docker/docker-compose.yml  up
```
