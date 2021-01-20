# Quarkus reproduction

When running `./gradlew quarkusDev`, the frontend is served at [localhost:8080/](localhost:8080/) and working, and `Filter.kt` is doing its 
job rerouting all unknown backend routes to the frontend when accessing for example [localhost:8080/about](localhost:8080/about).

When building the quarkus app with `./gradlew build`, and running the built runner with 
`java -jar build/repro-1.0-SNAPSHOT-runner.jar`, accessing [localhost:8080/](localhost:8080/) works, but 
[localhost:8080/about](localhost:8080/about) returns 404 Not Found. 
