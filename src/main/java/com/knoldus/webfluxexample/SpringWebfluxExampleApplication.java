package com.knoldus.webfluxexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@EnableMongoRepositories
@EnableReactiveMongoRepositories
@SpringBootApplication
public class SpringWebfluxExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxExampleApplication.class, args);
	}

}
