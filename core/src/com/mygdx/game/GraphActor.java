package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Majzer on 22/10/2017.
 */

public class GraphActor extends Actor {
    private Sprite sprite;
    private static Texture texture = null;

    public GraphActor() {
        if (texture == null){
            texture = new Texture("");
        }
        sprite = new Sprite(texture);

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
