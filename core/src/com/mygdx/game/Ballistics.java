package com.mygdx.game;

import com.badlogic.gdx.Gdx;

/**
 * Created by Majzer on 22/10/2017.
 */

public class Ballistics {

    private float x = 2;
    private float g = 9,81;//g erő


    public float getTavolsag(){
        return 10;
    }

    public float getMagassag(){
        return 5;
    }

    public float getGraphY(float graphX){
        return graphX*x*x/2.0f*2f;
    }

    public float getX() {
        return x;
    }
    //kezdő sebesség
    public float getSebessegKezdo() {return 15;}
    //képlet
    public float getAlpha(){return (getGraphY() + g * getX()* getX())/((getX()+2)*(getSebessegKezdo()+1))}

    public void setX(float x) {
        this.x = x;
        onRefresh();
    }

    public static void main(String[] args) {
        Ballistics ballistics = new Ballistics();
        ballistics.setX(3);
    }

    protected void onRefresh(){

    }




}
