package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.MyBaseClasses.Scene2D.MyActor;
import com.mygdx.game.MyBaseClasses.Scene2D.OneSpriteStaticActor;

/**
 * Created by tanulo on 2017. 10. 25..
 */

public class FloppyActor extends OneSpriteStaticActor {
    Sound sound = Assets.manager.get(Assets.STAR_SOUND);

    Ballistics ballistics;
    int indexOfAngles;

    public FloppyActor(Ballistics ballistics, int indexOfAngles) {
        super(Assets.manager.get(Assets.BADLOGIC_TEXTURE));
        this.ballistics = ballistics;
        this.indexOfAngles = indexOfAngles;
        setSize(50,50);
    }

    @Override
    public void act(float delta) {
        super.act(delta);

        float[] pos = ballistics.getXYbyTime(elapsedTime,indexOfAngles);
        setPosition(pos[0]-getWidth()/2, pos[1]-getHeight()/2);

        if (elapsedTime>ballistics.getTimeOfFlight(indexOfAngles)){
            getStage().getActors().removeValue(this, true);
            sound.play();
        }
    }
}
