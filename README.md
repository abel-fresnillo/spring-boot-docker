# Spring Boot App + Docker

Basic Spring Boot Rest API using a Docker container

The application consists of a simple Rest API with MongoDB in the backend.  

## Getting Started

### Prerequisites

The application was tested using the following software versions:

```
MongoDB v4.0.2
Docker 18.09.2
```

### Running the Application

If you haven't started your MongoDB Deamon, execute the following command to start it:

```
mongod
```

Once you checked out the project run Maven Install:

```
mvn clean install
```

To run the project execute the following command:

```
mvn spring-boot:run
```

Create your docker image running the command below:

```
docker build -t "spring-boot-docker" .
```

Run your docker container using this command:

```
docker run --name spring-boot-docker -p 8080:8080 spring-boot-docker:latest
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Abel Fresnillo** - [abel-fresnillo](https://github.com/abel-fresnillo)
