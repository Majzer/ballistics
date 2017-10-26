package com.mygdx.game.MyBaseClasses;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.MyBaseClasses.Scene2D.OneSpriteActor;
import com.mygdx.game.MyBaseClasses.Scene2D.OneSpriteStaticActor;

import javax.swing.JOptionPane;

import sun.rmi.runtime.Log;

/**
 * Created by tanulo on 2017. 10. 26..
 */

public class IBMActor extends OneSpriteStaticActor {

    public IBMActor(float x, float y) {
        super(Assets.manager.get(Assets.IBM_TEXTURE));
        setSize(100,100);

        setPosition(x-getWidth()/2, y-getHeight()/2);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        setSize(getWidth() + (float)Math.sin(elapsedTime*10)/4, getHeight() + (float)Math.sin(elapsedTime*10)/4);

    }
}
