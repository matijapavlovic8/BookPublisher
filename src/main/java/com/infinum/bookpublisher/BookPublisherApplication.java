package com.infinum.bookpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.infinum.bookpublisher.DTO")
@SpringBootApplication
public class BookPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookPublisherApplication.class, args);
	}

}
