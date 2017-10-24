package com.mygdx.game;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;


/**
 * Created by Majzer on 22/10/2017.
 */

public class Graph {

    private int szelesseg;
    private int magassag;
    private Ballistics ballistics;

    public Graph(int szelesseg, int magassag, Ballistics ballistics) {
        this.szelesseg = szelesseg;
        this.magassag = magassag;
        this.ballistics = ballistics;
    }

    public Texture getTexture(){
        Pixmap pixmap = new Pixmap(szelesseg, magassag, Pixmap.Format.RGBA8888);
        pixmap.setColor(0.2f, 0.2f, 0.2f, 1f);
        pixmap.fill();
        pixmap.setColor(1,1,1,1);
        for(int i = 0; i< szelesseg; i++){
            pixmap.drawPixel(i, magassag - (int)ballistics.getGraphY((ballistics.getTavolsag() / (float) szelesseg)*((float)i)));
        }
        return new Texture(pixmap);
    }

}
