package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyBaseClasses.IBMActor;
import com.mygdx.game.MyBaseClasses.Scene2D.MyStage;

/**
 * Created by tanulo on 2017. 10. 25..
 */

public class GameStage extends MyStage {


    public GameStage(Batch batch, MyGdxGame game) {
        super(new ExtendViewport(1024,768), batch, game);
        addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                addActor(new FloppyActor(new Ballistics(x,y,100),0));
                addActor(new FloppyActor(new Ballistics(x,y,100),1));
                addActor(new IBMActor(event.getStageX(), event.getStageY()));
            }
        });


        //setDebugAll(true);
    }

    @Override
    public void init() {

    }
}
