package com.mygdx.game;

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
        graph = new Graph(320,240,ballistics);
        setSize(320,240);
        refresh();
    }

    Ballistics ballistics;


    public void refresh(){
        if (sprite != null) {
            sprite.getTexture().dispose();
        }
        sprite = new Sprite(graph.getTexture());
        sprite.setSize(320,240);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        sprite.draw(batch);
    }
}
