package com.springbasics.UdemyLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemyLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyLearningApplication.class, args);
		MarioGame mario = new MarioGame();
		GamingConsole gc = new GamingConsole(mario);
		gc.start();
	}
}
