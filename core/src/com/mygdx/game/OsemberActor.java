package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyBaseClasses.Scene2D.OneSpriteStaticActor;

/**
 * Created by Majzer on 27/10/2017.
 */

public class OsemberActor extends OneSpriteStaticActor {


    public OsemberActor(Texture texture) {
        super(texture);
        setSize(180, 360);
        setPosition(texture.getWidth(), texture.getHeight()+85);
    }
}
