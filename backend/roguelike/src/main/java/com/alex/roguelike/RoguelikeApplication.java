package com.alex.roguelike;

import com.alex.roguelike.storage.StorageProperties;
import com.alex.roguelike.storage.StorageService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class RoguelikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoguelikeApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
		};
	}
}
