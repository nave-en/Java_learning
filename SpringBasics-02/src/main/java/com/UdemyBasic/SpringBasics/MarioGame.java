package com.UdemyBasic.SpringBasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Enter into the hole");
	}

	@Override
	public void right() {
		System.out.println("Run fast");
	}

	@Override
	public void left() {
		System.out.println("Move backwards");
	}
}
