# Distribuidoras

## Database

* Mysql (local)

```sh
docker run -d \
    --name mysql \
    --rm \
    -e MYSQL_ROOT_PASSWORD=root_pwd \
    -p 3306:3306 \
    mysql
```

## Maven

* run

```sh
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## Docker

* build 

```sh
docker build -t distribuidoras .
```

* run

```sh
docker run -d \
    --network host \
    -p 8080:8080  \
    -e PROFILE=dev \
    -e DATABASE_URL=jdbc:mysql://localhost:3306/api?createDatabaseIfNotExist=true \
    -e DATABASE_USER=root \
    -e DATABASE_PWD=root_pwd \
    distribuidoras
```

## References

- https://www.baeldung.com/spring-data-jpa-projections
- https://www.baeldung.com/spring-jpa-like-queries

