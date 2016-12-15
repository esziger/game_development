package com.snake.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Snake extends Game {
//	SpriteBatch batch;
//	Texture img;
	
	@Override
	public void create () {
		setScreen(new GameScreen());
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
	}

	
	@Override
	public void dispose () {
//		batch.dispose();
//		img.dispose();
	}
}
