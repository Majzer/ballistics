package com.mygdx.game;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.TemporalAction;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Majzer on 22/10/2017.
 */

public class ControlStage extends Stage {
    private GraphActor graphActor;
    private ControlActor controlActor;
    Sprite sprite;
    private Ballistics ballistics = new Ballistics(){
        @Override
        protected void onRefresh() {
            super.onRefresh();
            controlActor.refresh();
        }
    };

    public static Texture getTexture(){
        Pixmap pixmap = new Pixmap(640, 110, Pixmap.Format.RGBA8888);
        pixmap.setColor(0.2f, 0.2f, 0.2f, 1f);
        pixmap.fill();
        return new Texture(pixmap);
    }


    public ControlStage(Viewport viewport, Batch batch, GraphStage graphStage) {
        super(viewport, batch);
        setDebugAll(true);
    }

    public void refresh(){
        controlActor.refresh();
    }
}
