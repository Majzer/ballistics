package com.mygdx.game.MyBaseClasses;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.Ballistics;
import com.mygdx.game.ControlStage;
import com.mygdx.game.FloppyActor;
import com.mygdx.game.GameStage;
import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.MyBaseClasses.Scene2D.MyActor;
import com.mygdx.game.MyBaseClasses.Scene2D.OneSpriteActor;
import com.mygdx.game.MyBaseClasses.Scene2D.OneSpriteStaticActor;

import javax.swing.JOptionPane;
import javax.xml.soap.Text;

import sun.rmi.runtime.Log;

/**
 * Created by tanulo on 2017. 10. 26..
 */

public class IBMActor extends OneSpriteStaticActor {

    Sound soundFlopi1 = Assets.manager.get(Assets.FLOPI1_SOUND);
    Sound soundFlopi2 = Assets.manager.get(Assets.FLOPI2_SOUND);
    Sound soundXP = Assets.manager.get(Assets.XP_SOUND);
    Texture dos1 = Assets.manager.get(Assets.DOS1_TEXTURE);
    Texture dos2 = Assets.manager.get(Assets.DOS2_TEXTURE);
    Texture dos3 = Assets.manager.get(Assets.DOS3_TEXTURE);

    Ballistics ballistics;

    ControlStage controlStage;

    int life = 2, vel=1;
    public static boolean letrehozta=true;

    public int vel(int a, int b) {
        return (int)Math.floor(Math.random()*(b-a+1)+a);
    }

    public void decLife(){
        life--;
        if (life==1){
        soundFlopi1.play(400);
        }
        if (life==0){
            soundFlopi2.play(400);
            soundXP.play();
            vel = vel(1,3);
            if(vel==1) {
                getStage().addActor(new DosActor(dos1, getX(), getY()));
            } else if(vel==2) {
                getStage().addActor(new DosActor(dos2, getX(), getY()));
            } else getStage().addActor(new DosActor(dos3, getX(), getY()));
            getStage().getActors().removeValue(this, true);
        }
    }

    public IBMActor(float x, float y) {
        super(Assets.manager.get(Assets.IBM_TEXTURE));
            setSize(1, 1);
            setPosition(x - getWidth() / 2, y - getHeight() / 2);
    }

/*
    public IBMActor(float x, float y, final GameStage gameStage) {
        super(Assets.manager.get(Assets.IBM_TEXTURE));
        setSize(100, 100);
        setPosition(x - getWidth() / 2, y - getHeight() / 2);
        this.gameStage = gameStage;
    }
*/


    @Override
    public void act(float delta) {
        super.act(delta);
        setSize(getWidth() + (float)Math.cos(elapsedTime*10)/40, getHeight() + (float)Math.sin(elapsedTime*10)/40);
     /*   if(!letrehozta) {
            getStage().getActors().removeValue(this, true);
            letrehozta = true;
        } */
    }
}
