package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example", "com.example.controller", "com.example.service", "com.example.dao", "com.example.modal"})
@EntityScan({"com.example", "com.example.controller", "com.example.service", "com.example.dao", "com.example.modal"})
public class EsunVoteSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsunVoteSysApplication.class, args);
	}

}
