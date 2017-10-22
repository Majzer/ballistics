package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture cannon;
	Texture target;
	Texture background;
	Sprite cannonSprite;
	Sprite targetSprite;
	Ballistics ballistics = new Ballistics();
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		cannon = new Texture("cannon.png");
		target = new Texture("target.png");
		background = new Texture("background.png");
		cannonSprite = new Sprite(cannon);
		cannonSprite.setSize(128,128);
		targetSprite = new Sprite(target);
		targetSprite.setSize(128,128);
		targetSprite.setPosition(ballistics.getTargetX(),ballistics.getTargetY());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(background, 0, 0);
		cannonSprite.draw(batch);
		targetSprite.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		cannon.dispose();
	}
}
