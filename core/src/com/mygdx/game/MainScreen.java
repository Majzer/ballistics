package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.MyBaseClasses.DosActor;
import com.mygdx.game.MyBaseClasses.IBMActor;
import com.mygdx.game.MyBaseClasses.Scene2D.MyScreen;
import com.mygdx.game.MyBaseClasses.Scene2D.MyStage;

/**
 * Created by Majzer on 22/10/2017.
 */

public class MainScreen extends MyScreen {

    GameStage gameStage;
    ControlStage controlStage;
    IBMActor ibmActor;
    Sound sound = Assets.manager.get(Assets.BACKGROUND_SOUND);

    public MainScreen(MyGdxGame game) {
        super(game);
        setBackGroundColor(0.4f, 0.2f,0f);
        gameStage = new GameStage(spriteBatch, game);
        controlStage = new ControlStage(spriteBatch, game, gameStage);
        sound.loop(50);
        InputMultiplexer im = new InputMultiplexer();
        im.addProcessor(controlStage);
        im.addProcessor(gameStage);
        Gdx.input.setInputProcessor(im);

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        gameStage.act(delta);
        gameStage.draw();
        controlStage.act(delta);
        controlStage.draw();
    }

    @Override
    public void init() {

    }
}
