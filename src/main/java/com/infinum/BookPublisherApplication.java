package com.infinum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackageClasses = {com.infinum.bookpublisher.DAO.BookRepository.class,
    com.infinum.bookpublisher.DAO.AuthorRepository.class,
    com.infinum.bookpublisher.REST.HomeController.class})
@EnableJpaRepositories(basePackages = "com.infinum.bookpublisher.DTO")
public class BookPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookPublisherApplication.class, args);
	}

}
