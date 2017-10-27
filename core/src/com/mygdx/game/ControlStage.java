package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.MyBaseClasses.DosActor;
import com.mygdx.game.MyBaseClasses.MySlider;
import com.mygdx.game.MyBaseClasses.Scene2D.MyStage;

/**
 * Created by tanulo on 2017. 10. 25..
 */

public class ControlStage extends MyStage {

    GameStage gameStage;
    Ballistics ballistics;
    float slider_ertek;

    public GameStage getGameStage() {
        return gameStage;
    }

    public float getSlider() {
        return slider_ertek;
    }

    public ControlStage(Batch batch, MyGdxGame game, final GameStage gameStage) {
        super(new ExtendViewport(1024,768), batch, game);
        this.gameStage = gameStage;


        /*
        //1-es röppálya gomb!!
        Button buttonV0_1;
        addActor(buttonV0_1 = new Button(game.getButtonStyleV0_1()));
        buttonV0_1.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                //Röppályákat tartalmazó tömb 0. elemére mutató változó
            }
        });
        buttonV0_1.setPosition(50, getViewport().getWorldHeight()-buttonV0_1.getWidth()-30);

        //2-es röppálya gomb!!
        Button buttonV0_2;
        addActor(buttonV0_2 = new Button(game.getButtonStyleV0_2()));
        buttonV0_2.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                //Röppályákat tartalmazó tömb 1. elemére mutató változó
            }
        });
        buttonV0_2.setPosition(buttonV0_1.getWidth()*2 , getViewport().getWorldHeight()-buttonV0_2.getHeight()-buttonV0_1.getHeight() );
        */

        //Szükséges szög "gomb"
        Button buttonSzog;
        addActor(buttonSzog = new Button(game.getButtonStyleSzog()));
        buttonSzog.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                //Röppályákat tartalmazó tömb 1. elemére mutató változó
            }
        });
        buttonSzog.setPosition(5, getViewport().getWorldHeight() - buttonSzog.getHeight() - 20);

        //Cél magassága"gomb"
        Button buttonCelmag;
        addActor(buttonCelmag = new Button(game.getButtonStyleCelmag()));
        buttonSzog.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
            }
        });
        buttonCelmag.setPosition(5, getViewport().getWorldHeight() - buttonSzog.getHeight() - buttonCelmag.getHeight() - 20);

        //Cél távolsága"gomb"
        Button buttonCeltav;
        addActor(buttonCeltav = new Button(game.getButtonStyleCeltav()));
        buttonSzog.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
            }
        });
        buttonCeltav.setPosition(5, getViewport().getWorldHeight() - buttonSzog.getHeight() - buttonCelmag.getHeight() - buttonCeltav.getMinHeight() - 20);


        //V0 változtató slider
        final MySlider slider = new MySlider(1,50, 0.01f, false, game.getSliderStyle());
        slider.setValue(10);
        gameStage.setV0(slider.getValue());
        slider.addCaptureListener(new ChangeListener() {
            @Override
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                //slider_ertek = ((Slider)actor).getValue();
                //System.out.println(((Slider)actor).getValue() + " m/s");
                gameStage.setV0(slider.getValue());
            }
        });
        slider.setPosition(getViewport().getWorldWidth()/2-200, getViewport().getWorldHeight()-50);
        slider.setUnits("m/s");
        slider.setSize(600,20);
        //slider.setValue(100);
        addActor(slider);
        final MySlider speedSlider = new MySlider(0.01f, 1,0.001f, false,game.getSliderStyle());
        speedSlider.setValue(1);
        speedSlider.setUnits("x speed");
        gameStage.setTimeScale(speedSlider.getValue());
        speedSlider.addCaptureListener(new ChangeListener() {
            @Override
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                gameStage.setTimeScale(speedSlider.getValue());
            }
        });
        speedSlider.setPosition(getViewport().getWorldWidth()/2-200, getViewport().getWorldHeight()-100);
        speedSlider.setSize(600,20);
        addActor(speedSlider);

    }


    public Label.LabelStyle getLabelStyle() {
        Label.LabelStyle style;
        style = new com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle();
        style.font = Assets.manager.get(Assets.ARIAL_30_FONT);
        style.fontColor = Color.WHITE;
        return style;
    }

    @Override
    public void init() {
        final Label lblV0 = new Label("Kilövési sebesség", getLabelStyle());
        lblV0.setPosition(getViewport().getWorldWidth()/2-475, getViewport().getWorldHeight()-55);
        lblV0.setTouchable(Touchable.disabled);
        addActor(lblV0);
        final Label lblSpeed = new Label("Lejátszási sebesség", getLabelStyle());
        lblSpeed.setPosition(getViewport().getWorldWidth()/2-475, getViewport().getWorldHeight()-105);
        lblSpeed.setTouchable(Touchable.disabled);
        addActor(lblSpeed);
    }
}