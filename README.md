# Swagger demo

This is a demo of swagger in a spring project based on https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api

Finally I had to use another documentation library to make it work with my version of spring boot: https://springdoc.org/v2/

## Incompatible because this component declares an API of a component compatible with Java 17 and the consumer needed a runtime of a component compatible with Java 11

In Intellij, change the configuration as follows to use the right java version: https://stackoverflow.com/questions/72117858/incompatible-because-this-component-declares-a-component-compatible-with-java-11

## Swagger

Go to http://localhost:8080/swagger-ui/index.html. You find a description of the Book API

## API Docs

Go to http://localhost:8080/v3/api-docs

## Findings:

- Swagger documents out of the box
- The Pageable parameter is awesome for conventional pagination and sorting.