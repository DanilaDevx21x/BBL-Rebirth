package ru.Wayfarerx21x.bbl.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class LoadingScreen implements Screen {
    private Game game;
    private SpriteBatch batch;
    private AssetManager manager;
    private BitmapFont font;
    private OrthographicCamera cam;
    
    public LoadingScreen(Game game, SpriteBatch batch, AssetManager manager){
        this.game = game;
        this.batch = batch;
        this.manager = manager;
        this.cam = new OrthographicCamera(800,480);
        //this.cam.position.set(80,100,0);
        this.cam.lookAt(100,100,0);
        this.font = new BitmapFont();
        this.font.setColor(Color.BLACK);
        this.font.getData().setScale(2f);
    }
    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        cam.update(true);
        batch.setProjectionMatrix(cam.combined);
        batch.begin();
        font.draw(batch,"Hello",100,100);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }

    
    
    
}
