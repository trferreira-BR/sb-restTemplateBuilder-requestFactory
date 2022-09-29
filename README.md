# sb-restTemplateBuilder-requestFactory - An experiment to create ResTemplate with Apache HTTP Client with a custom ClientHttpRequestFactory :rocket:

<br /><br />
![Java](https://img.shields.io/badge/Java-17-green?style=plastic&logo=java)
![Spring Boot](https://img.shields.io/badge/SpringBoot-2.7.4-green?style=plastic&logo=spring)
![Maven](https://img.shields.io/badge/Maven-green?style=plastic)

That experiment is a great experiment to test some implementations of ResTemplate wit custom ClientHttpRequestFactory loading the test with [Apache JMeter](https://jmeter.apache.org/)
<br />

## Main characteristics

- There is a JMeter archive `\src\test\resources\jmeter\loadTest.jmx` to be used in a load test together with the project [delegate-demo-request](https://github.com/trferreira-BR/delegate-demo-request)
- There is a configuration in `application.yml` to log org.apache.http with level DEBUG

### Requirements ###

* Java 17
* Maven 3.3.x

### Building the artifact ###

```
mvn clean package
```

### Running the application from command line ###

```
mvn spring-boot:run -Dserver.port=8900
```

### Available URLs

```
http://localhost:8900/delegate/demo
```
should result in successful responses.