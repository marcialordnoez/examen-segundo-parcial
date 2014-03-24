package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Inputbienvenida extends InputListener {
    bienvenida b;
    Inputbienvenida(bienvenida param){
    	super();
    	b=param;
    }
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		b.setVisible(false);
		return false;
	}

}
