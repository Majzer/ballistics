package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyBaseClasses.Scene2D.OneSpriteStaticActor;

/**
 * Created by Majzer on 27/10/2017.
 */

public class OsemberActor extends OneSpriteStaticActor {


    public OsemberActor(Texture texture) {
        super(texture);
        setSize(1.80f, 3.60f);
        setPosition(0, 0.85f);
    }

    public void doAngry(){
        System.out.println("Mérges");
    }
}
