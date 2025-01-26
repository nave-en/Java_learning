package com.springbasics.UdemyLearning;

public class SuperContra implements GameRunner {

	@Override
	public void up() {
		System.out.println("Run forward");
	}

	@Override
	public void down() {
		System.out.println("Crawl");
	}

	@Override
	public void left() {
		System.out.println("Move backward");
	}

	@Override
	public void right() {
		System.out.println("Shoot");
	}

}
