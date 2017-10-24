package com.mygdx.game;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by tanulo on 2017. 10. 24..
 */

public class ControlActor extends Actor{
    Sprite sprite;

    public void refresh(){
        if (sprite != null) {
            sprite.getTexture().dispose();
        }
        sprite = new Sprite(graph.getTexture());
        sprite.setPosition(640,0);
        sprite.setSize(640,-110);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        sprite.draw(batch);
    }

    public Texture getTexture(){
        Pixmap pixmap = new Pixmap(szelesseg, magassag, Pixmap.Format.RGBA8888);
        pixmap.setColor(0.2f, 0.2f, 0.2f, 0f);
        pixmap.fill();
        pixmap.setColor(1,1,1,1);
        for(int i = 0; i< szelesseg; i++){
            pixmap.drawPixel(i, magassag - (int)ballistics.getGraphY((ballistics.getTavolsag() / (float) szelesseg)*((float)i)));
        }
        return new Texture(pixmap);
    }
}
