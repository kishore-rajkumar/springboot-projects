package com.kishore.springboot.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectsApplication.class, args);
	}

}
