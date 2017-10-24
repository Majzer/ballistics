package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Majzer on 22/10/2017.
 */

public class ControlStage extends Stage {
    GraphStage graphStage;

    public ControlStage(Viewport viewport, Batch batch, GraphStage graphStage) {
        super(viewport, batch);
        this.graphStage= graphStage;
        setDebugAll(true);

        //graphStage.refresh();
    }
}
