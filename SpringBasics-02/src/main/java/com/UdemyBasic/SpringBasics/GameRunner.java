package com.UdemyBasic.SpringBasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;

	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
		this.game = game;
	}

	public void start() {
		game.down();
		game.up();
		game.left();
		game.right();
	}
}
