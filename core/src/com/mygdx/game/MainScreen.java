package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

/**
 * Created by Majzer on 22/10/2017.
 */

public class MainScreen implements Screen{


    SpriteBatch batch = new SpriteBatch();
    GraphStage graphStage = new GraphStage(new ExtendViewport(640, 480, new OrthographicCamera(640, 480)), batch);
    ControlStage controlStage = new ControlStage(new ExtendViewport(640, 480, new OrthographicCamera(640, 480)), batch, graphStage);
    Texture hatter = new Texture("hatter\\background.png");

    public MainScreen() {

        InputMultiplexer inputMultiplexer = new InputMultiplexer();
        inputMultiplexer.addProcessor(graphStage);
        inputMultiplexer.addProcessor(controlStage);
        Gdx.input.setInputProcessor(inputMultiplexer);

    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(hatter, 0, 0);
        batch.end();
        controlStage.act(Gdx.graphics.getDeltaTime());
        controlStage.draw();
        graphStage.act(Gdx.graphics.getDeltaTime());
        graphStage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
    }

}
