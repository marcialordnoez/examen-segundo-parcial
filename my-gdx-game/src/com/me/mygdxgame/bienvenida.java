package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class bienvenida extends Image {
public bienvenida(){
	super(new Texture("data/fondo2.png"));{
	this.addListener(new Inputbienvenida(this));}
	
}
}
