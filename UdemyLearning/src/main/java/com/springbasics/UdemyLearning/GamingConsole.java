package com.springbasics.UdemyLearning;

public class GamingConsole {
	GameRunner gameRunner;

	public GamingConsole(GameRunner gameRunner) {
		this.gameRunner = gameRunner;
	}

	public void start() {
		gameRunner.right();
		gameRunner.left();
		gameRunner.up();
		gameRunner.down();
	}
}
