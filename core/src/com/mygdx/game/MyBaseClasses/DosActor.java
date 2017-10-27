package com.mygdx.game.MyBaseClasses;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GameStage;
import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.MyBaseClasses.Scene2D.OneSpriteStaticActor;

/**
 * Created by tanulo on 2017. 10. 26..
 */

public class DosActor extends OneSpriteStaticActor {


    public DosActor(Texture texture) {
        super(texture);
        setSize(102.4f,76.8f);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        if(getWidth()<1024)
        setSize(102.4f*elapsedTime*4,76.8f*elapsedTime*4);
        if(3.0 < elapsedTime)  {
            getStage().getActors().removeValue(this, true);
        }

    }
}
