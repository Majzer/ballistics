package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by tanulo on 2017. 10. 24..
 */

public class ControlActor extends Actor {

    Sprite sprite;
    Graph graph;

    public ControlActor(Ballistics ballistics) {
        this.ballistics = ballistics;
        graph = new Graph(640, 110, ballistics);
        setSize(640, 110);
        refresh();
    }

    Ballistics ballistics;


    public void refresh() {
        if (sprite != null) {
            sprite.getTexture().dispose();
        }
        sprite = new Sprite(ControlStage.getTexture());
        sprite.setPosition(0f,370f);
        sprite.setSize(640, 110);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        sprite.draw(batch);
    }

}