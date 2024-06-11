# test-springboot-app

## Create Springboot App (30m)
https://www.javaguides.net/2018/11/spring-getmapping-postmapping-putmapping-deletemapping-patchmapping.html


## Dockerize app (30m)
https://www.baeldung.com/dockerizing-spring-boot-application

    mvn package
    docker build --tag=app .
    docker run -p8080:8080 -eSECRET=iwdrox app

See [test.http](test.http) for sample requests against the app.