package com.john.graphite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;

@SpringBootApplication
@ComponentScan({"com.john.graphite"})
public class JohnHalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JohnHalApplication.class, args);
	}

}
