package com.UdemyBasic.SpringBasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Bend down");
	}

	@Override
	public void right() {
		System.out.println("Shoot");
	}

	@Override
	public void left() {
		System.out.println("Go Backward");
	}

}
