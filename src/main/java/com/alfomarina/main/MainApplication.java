package com.alfomarina.main;

import org.graalvm.compiler.serviceprovider.ServiceProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.alfomarina"})
@EntityScan(basePackages = "com.alfomarina.models")
@EnableJpaRepositories(basePackages = ("com.alfomarina.repositories"))
@SpringBootApplication

public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
