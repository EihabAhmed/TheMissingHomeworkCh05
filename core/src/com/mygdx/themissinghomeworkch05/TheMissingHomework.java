package com.mygdx.themissinghomeworkch05;

public class TheMissingHomework extends BaseGame {
	@Override
	public void create() {
		super.create();
		setActiveScreen(new MenuScreen());
	}
}
