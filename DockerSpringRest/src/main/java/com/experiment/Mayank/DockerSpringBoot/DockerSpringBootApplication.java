package com.experiment.Mayank.DockerSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.experiment.Mayank")
@SpringBootApplication
public class DockerSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("Running app");
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}

}