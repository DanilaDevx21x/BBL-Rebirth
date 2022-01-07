package ru.Wayfarerx21x.bbl;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import ru.Wayfarerx21x.bbl.screens.GameScreen;
import com.badlogic.gdx.assets.AssetManager;
import ru.Wayfarerx21x.bbl.screens.LoadingScreen;

public class MyGdxGame extends Game {

    private SpriteBatch batch;
    private AssetManager manager;

    @Override
    public void create() {
        batch = new SpriteBatch();
        manager = new AssetManager();
        this.setScreen(new GameScreen(this,batch,manager));
    }

    @Override
    public void render(){
        super.render();
    }

    @Override
    public void dispose(){
        batch.dispose();
        manager.dispose();
    }

}

