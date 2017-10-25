package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.MyBaseClasses.Game.MyGame;

public class MyGdxGame extends MyGame {

	@Override
	public void create () {
		setScreen(new MainScreen());
	}


}