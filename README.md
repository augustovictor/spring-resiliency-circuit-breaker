# spring-resiliency-circuit-breaker

This application illustrates how to respond with a fallback answer when a 3rd party service is down.

## Running the demo

1. Run `node server.js`
1. Start the spring application: `./gradlew bootRun`
1. Make a `GET` request to `http://localhost:8080/v1/movies`
1. Stop the `server.js` application
1. Make a `GET` request to `http://localhost:8080/v1/movies`