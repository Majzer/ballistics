package com.mygdx.game;

import com.badlogic.gdx.Gdx;

/**
 * Created by Majzer on 22/10/2017.
 */

public class Ballistics {

    private float targetY;
    private float targetX;
    private float velocity;

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getTargetX() {
        return Gdx.graphics.getWidth()-128;
    }

    public void setTargetX(float targetX) {
        this.targetX = targetX;
    }

    public float getTargetY() {
        return 0;
    }

    public void setTargetY(float targetY) {
        this.targetY = targetY;
    }




}
