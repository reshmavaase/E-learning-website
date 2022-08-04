package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.*")
@SpringBootApplication(scanBasePackages="com.*")
@EntityScan("com.*")
@ComponentScan(basePackages="com.*")
public class ElearningSpringbootwebsite01Application {
	public static void main(String[] args) {
		SpringApplication.run(ElearningSpringbootwebsite01Application.class, args);
	}

}
