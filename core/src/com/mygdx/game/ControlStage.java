package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyBaseClasses.Scene2D.MyStage;

import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

/**
 * Created by tanulo on 2017. 10. 25..
 */

public class ControlStage extends MyStage {

    GameStage gameStage;

    public ControlStage(Batch batch, MyGdxGame game, final GameStage gameStage) {
        super(new ExtendViewport(1024,768), batch, game);
        this.gameStage = gameStage;


        TextButton button;
        addActor(button = new TextButton("Törlés", game.getTextButtonStyle()));
        button.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                gameStage.getActors().clear();
            }
        });

        button.setPosition(getViewport().getWorldWidth()-button.getWidth(), getViewport().getWorldHeight()-button.getHeight());

    }

    @Override
    public void init() {

    }
}
