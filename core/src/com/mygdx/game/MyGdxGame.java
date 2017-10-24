package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture agyu;
	Texture cel;
	Texture hatter;
	Sprite cannonSprite;
	Sprite targetSprite;
	Ballistics ballistics = new Ballistics();
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		agyu = new Texture("spriteok\\cannon.png");
		cel = new Texture("spriteok\\target.png");
		hatter = new Texture("hatter\\background.png");
		cannonSprite = new Sprite(agyu);
		cannonSprite.setSize(128,128);
		targetSprite = new Sprite(cel);
		targetSprite.setSize(128,128);
		targetSprite.setPosition(ballistics.getCelX(),ballistics.getCelY());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(hatter, 0, 0);
		cannonSprite.draw(batch);
		targetSprite.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		agyu.dispose();
	}
}
