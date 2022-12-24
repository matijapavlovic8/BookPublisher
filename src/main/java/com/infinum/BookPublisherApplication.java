package com.infinum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.infinum.bookpublisher.DAO", "com.infinum.bookpublisher.REST"})
@EnableJpaRepositories(basePackages = "com.infinum.bookpublisher.DTO")
public class BookPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookPublisherApplication.class, args);
	}

}
