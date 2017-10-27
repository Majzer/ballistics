//https://github.com/tuskeb/mester
package com.mygdx.game.GlobalClasses;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;


public class Assets {
	// https://github.com/libgdx/libgdx/wiki/Managing-your-assets
	// http://www.jacobplaster.net/using-libgdx-asset-manager
	// https://www.youtube.com/watch?v=JXThbQir2gU
	// https://github.com/Matsemann/libgdx-loading-screen/blob/master/Main/src/com/matsemann/libgdxloadingscreen/screen/LoadingScreen.java

	public static AssetManager manager;
	public static final String CHARS = "0123456789öüóqwertzuiopőúasdfghjkléáűíyxcvbnm'+!%/=()ÖÜÓQWERTZUIOPŐÚASDFGHJKLÉÁŰÍYXCVBNM?:_*<>#&@{}[],-.";


	static final FreetypeFontLoader.FreeTypeFontLoaderParameter fontParameter = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
	static {
		fontParameter.fontFileName = "arial.ttf";
		fontParameter.fontParameters.size = 30;
		fontParameter.fontParameters.characters = CHARS;
		fontParameter.fontParameters.color = Color.WHITE;
	}

	static final FreetypeFontLoader.FreeTypeFontLoaderParameter fontParameter2 = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
	static {
		fontParameter2.fontFileName = "arial.ttf";
		fontParameter2.fontParameters.size = 30;
		fontParameter2.fontParameters.characters = CHARS;
		fontParameter2.fontParameters.color = Color.WHITE;
	}

	public static final AssetDescriptor<BitmapFont> ARIAL_15_FONT
			= new AssetDescriptor<BitmapFont>(fontParameter2.fontFileName, BitmapFont.class, fontParameter2);

	public static final AssetDescriptor<BitmapFont> ARIAL_30_FONT
			= new AssetDescriptor<BitmapFont>(fontParameter.fontFileName, BitmapFont.class, fontParameter);

	public static final AssetDescriptor<Texture> FLOPPYDISK_TEXTURE
			= new AssetDescriptor<Texture>("segedletek/Floppy_Disk.png", Texture.class);

	public static final AssetDescriptor<Texture> V0_BUTTON_1_TEXTURE
			= new AssetDescriptor<Texture>("Gombok/v0_buttons/gomb1.png", Texture.class);

	public static final AssetDescriptor<Texture> V0_BUTTONDOWN_1_TEXTURE
			= new AssetDescriptor<Texture>("Gombok/v0_buttons/gomb1_down.png", Texture.class);

	public static final AssetDescriptor<Texture> V0_BUTTON_2_TEXTURE
			= new AssetDescriptor<Texture>("Gombok/v0_buttons/gomb2.png", Texture.class);

	public static final AssetDescriptor<Texture> V0_BUTTONDOWN_2_TEXTURE
			= new AssetDescriptor<Texture>("Gombok/v0_buttons/gomb2_down.png", Texture.class);

	public static final AssetDescriptor<Texture> SLIDER_TEXTURE
			= new AssetDescriptor<Texture>("Gombok/slider/slider_01.png", Texture.class);

	public static final AssetDescriptor<Texture> KNOB_TEXTURE
			= new AssetDescriptor<Texture>("Gombok/slider/knob.png", Texture.class);

	public static final AssetDescriptor<Texture> IBM_TEXTURE
			= new AssetDescriptor<Texture>("actor/ibm_pc.png", Texture.class);

    public static final AssetDescriptor<Texture> DOS1_TEXTURE
            = new AssetDescriptor<Texture>("actor/DOS1.png", Texture.class);

    public static final AssetDescriptor<Texture> DOS2_TEXTURE
            = new AssetDescriptor<Texture>("actor/DOS2.png", Texture.class);

    public static final AssetDescriptor<Texture> DOS3_TEXTURE
            = new AssetDescriptor<Texture>("actor/DOS3.jpg", Texture.class);

	public static final AssetDescriptor<Texture> SZOG_TEXTURE
			= new AssetDescriptor<Texture>("Gombok/szog.png", Texture.class);

	public static final AssetDescriptor<Texture> BACKGROUND_TEXTURE
			= new AssetDescriptor<Texture>("hatter/background.png", Texture.class);

	public static final AssetDescriptor<Texture> OSEMBER_TEXTURE
			= new AssetDescriptor<Texture>("actor/Osember_01.png", Texture.class);

	public static final AssetDescriptor<Texture> CELMAG_TEXTURE
			= new AssetDescriptor<Texture>("Gombok/cel_mag.png", Texture.class);

	public static final AssetDescriptor<Texture> CELTAV_TEXTURE
			= new AssetDescriptor<Texture>("Gombok/cel_tav.png", Texture.class);

	public static final AssetDescriptor<Sound> STAR_SOUND
			= new AssetDescriptor<Sound>("Hangok/star.wav", Sound.class);

	public static final AssetDescriptor<Sound> BACKGROUND_SOUND
			= new AssetDescriptor<Sound>("Hangok/backgroundmusic.wav", Sound.class);

	public static final AssetDescriptor<Sound> XP_SOUND
			= new AssetDescriptor<Sound>("Hangok/xp.wav", Sound.class);

	public static final AssetDescriptor<Sound> FLOPI1_SOUND
			= new AssetDescriptor<Sound>("Hangok/flopi1.wav", Sound.class);

	public static final AssetDescriptor<Sound> FLOPI2_SOUND
			= new AssetDescriptor<Sound>("Hangok/flopi2.wav", Sound.class);


    public static void prepare() {
		manager = new AssetManager();
		Texture.setAssetManager(manager);
	}

	public static void load() {
		FileHandleResolver resolver = new InternalFileHandleResolver();
		manager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
		manager.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(resolver));
		manager.setLoader(BitmapFont.class, ".otf", new FreetypeFontLoader(resolver));

		manager.load(FLOPPYDISK_TEXTURE);

		manager.load(IBM_TEXTURE);

		manager.load(ARIAL_30_FONT);

		manager.load(ARIAL_15_FONT);

		manager.load(STAR_SOUND);

		manager.load(BACKGROUND_SOUND);

		manager.load(XP_SOUND);

		manager.load(FLOPI1_SOUND);

		manager.load(FLOPI2_SOUND);

		manager.load(V0_BUTTON_1_TEXTURE);

		manager.load(V0_BUTTONDOWN_1_TEXTURE);

		manager.load(V0_BUTTON_2_TEXTURE);

		manager.load(V0_BUTTONDOWN_2_TEXTURE);

		manager.load(SLIDER_TEXTURE);

		manager.load(KNOB_TEXTURE);

		manager.load(DOS1_TEXTURE);

		manager.load(DOS2_TEXTURE);

		manager.load(DOS3_TEXTURE);

		manager.load(SZOG_TEXTURE);

		manager.load(BACKGROUND_TEXTURE);

		manager.load(OSEMBER_TEXTURE);

		manager.load(CELMAG_TEXTURE);

		manager.load(CELTAV_TEXTURE);
	}

    public static void afterLoaded() {
        //manager.get(MUSIC).setLooping(true);
    }

	public static void unload() {
		manager.dispose();
	}

}
