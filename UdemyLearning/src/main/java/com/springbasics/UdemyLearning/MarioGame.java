package com.springbasics.UdemyLearning;

public class MarioGame implements GameRunner {

	@Override
	public void up() {
		System.out.println("Jump Up");
	}

	@Override
	public void down() {
		System.out.println("Enter into the hole");
	}

	@Override
	public void left() {
		System.out.println("Going back");
	}

	@Override
	public void right() {
		System.out.println("Going forward");
	}
}
