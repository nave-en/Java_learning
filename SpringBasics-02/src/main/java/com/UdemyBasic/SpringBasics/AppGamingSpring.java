package com.UdemyBasic.SpringBasics;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.UdemyBasic.SpringBasics")
public class AppGamingSpring {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(AppGamingSpring.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).start();
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}
}
