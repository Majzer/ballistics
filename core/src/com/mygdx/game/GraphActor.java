package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Majzer on 22/10/2017.
 */

public class GraphActor extends Actor {
    Sprite sprite;
    Graph graph;

    public GraphActor(Ballistics ballistics) {
        this.ballistics = ballistics;
        graph = new Graph(640,370,ballistics);
        setSize(640,370);
        refresh();
    }

    Ballistics ballistics;


    public void refresh(){
        if (sprite != null) {
            sprite.getTexture().dispose();
        }
        sprite = new Sprite(graph.getTexture());
        sprite.setSize(640,370);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        sprite.draw(batch);
    }
}
