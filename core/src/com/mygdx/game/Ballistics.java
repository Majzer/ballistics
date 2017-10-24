package com.mygdx.game;

import com.badlogic.gdx.Gdx;

/**
 * Created by Majzer on 22/10/2017.
 */

public class Ballistics {

    private float celY;
    private float celX;
    private float sebesseg;

    public float getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(float sebesseg) {
        this.sebesseg = sebesseg;
    }

    public float getCelX() {
        return Gdx.graphics.getWidth()-128;
    }

    public void setCelX(float celX) {
        this.celX = celX;
    }

    public float getCelY() {
        return 0;
    }

    public void setCelY(float celY) {
        this.celY = celY;
    }




}
