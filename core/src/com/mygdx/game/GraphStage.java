package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Majzer on 22/10/2017.
 */

public class GraphStage extends Stage{
    private GraphActor graphActor;
    private Ballistics ballistics = new Ballistics(){
        @Override
        protected void onRefresh() {
            super.onRefresh();
            graphActor.refresh();
        }
    };


    public Ballistics getBallistics() {
        return ballistics;
    }




    public GraphStage(Viewport viewport, Batch batch) {
        super(viewport, batch);
        addActor(graphActor = new GraphActor(ballistics));
        graphActor.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                ballistics.setX(ballistics.getX()*2);
            }
        });
        setDebugAll(true);
    }

    public void refresh(){
        graphActor.refresh();
    }
}

