package com.infinum.bookpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.infinum.bookpublisher")
@EnableJpaRepositories(basePackages = "com.infinum.bookpublisher.domain")
@ComponentScan({"com.infinum.bookpublisher.rest", "com.infinum.bookpublisher.dao"})
public class BookPublisherApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookPublisherApplication.class, args);
	}
}
