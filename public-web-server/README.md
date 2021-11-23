# Public Web Server

This server is a external service and accessible from internet. This server is capable to request another server.

### To run this application

```java
mvn spring-boot:run
```

### To build docker images of this application

```java
./mvnw package-Pprod-DskipTests jib:dockerBuild
```

### To run docker images of this application

```java
docker-compose-f src/main/docker/docker-compose.yml up

```

curl http://localhost:8080/api/users?url=http://localhost:8081/api/userDetail/0

{'name':'User-0','id':'0'}

curl http://localhost:8080/api/users?url=http://localhost:8081/api/userAddress/0

{'address':'Ahmedabad, India','id':'0'}

curl http://localhost:8080/api/users?url=http://localhost:8083/api/adminDetail

{'username':'admin','password':'OhMyGod@123'}

curl http://localhost:8080/api/users?url=http://localhost:8083/api/dbDetail

{'dbName':'controller','host':'10.0.1.35','username':'root', 'password':'XSuper@#12345', 'port':'5432'}