Vehicles MicroService
=============

Micro services based in  architecture to manage all business services releted with vehicles entity domain.
[Spring Cloud Netflix](https://cloud.spring.io/spring-cloud-netflix/) . 


Features
-------------

* External Configuration: Using client-side support for externalized configuration in a distributed system Based Spring Cloud Config Solution.
* Service Discovery: Eureka instances can be registered and clients can discover the instances using Spring-managed beans
* Circuit Breaker: Hystrix clients can be built with a simple annotation-driven method decorator
* Declarative REST Client: Feign creates a dynamic implementation of an interface decorated with JAX-RS or Spring MVC annotations
* Client Side Load Balancer: Ribbon
* Router and Filter: automatic registration of Zuul filters, and a simple convention over configuration approach to reverse proxy creation


**Setting up micro service:**

1.  External Configuration:

 ```
	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
            	<artifactId>spring-cloud-starter-parent</artifactId>
				<version>Camden.BUILD-SNAPSHOT</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
```

 ```
	<dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-config</artifactId>
		</dependency>

		...

	</dependencies>
```

2.  Service Discovery:

Modify the Application class. Add @EnableDiscoveryClient.

3.  Circuit Breaker:

4.	Feign:

5.  Ribbon:

6.  Zuul:
