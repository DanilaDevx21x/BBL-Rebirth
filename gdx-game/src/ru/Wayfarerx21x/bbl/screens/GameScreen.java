package ru.Wayfarerx21x.bbl.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer.Cell;
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile;
import com.badlogic.gdx.graphics.Texture;
import ru.Wayfarerx21x.bbl.utils.Camera2D;
import com.badlogic.gdx.assets.AssetManager;
import java.util.HashMap;
import ru.Wayfarerx21x.bbl.blocks.Block;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class GameScreen implements Screen {
    private Game game;
    private SpriteBatch batch;
    private OrthographicCamera cam;
    private BitmapFont font;

    public HashMap<Integer,Block> blocks = new HashMap<Integer,Block>();

    private TiledMap map;
    private TiledMapRenderer renderer;
    private MapLayers mapLayers;
    private TiledMapTileLayer layer;

  //  private Texture grassTexture;

    private Camera2D camera;
    
    private AssetManager manager;

    public GameScreen(Game game, SpriteBatch batch, AssetManager manager) {
        this.game = game;
        this.batch = batch;
        this.manager = manager;
        this.camera = new Camera2D(10);
        this.font = new BitmapFont();
    //    this.font.setColor(Color.BLACK);
        this.font.getData().setScale(0.12f);
        initTextures();
        this.manager.finishLoading();
        initBlocks();

     //   grassTexture = new Texture(Gdx.files.internal("blocks/stone.png"));

    }
    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update(batch);

        batch.begin();
       for(float x = camera.X; x < camera.X + camera.W; x++){
            for(float y = camera.Y; y < camera.Y + camera.H; y++){
                 blocks.get(1).draw(batch,x,y);
            }
        }
        
       /*for(int x = 0; x<1000; x++){
            for(int y = 0; y<1000; y++){
                blocks.get(1).draw(batch,x,y);
            }
        }*/
        font.draw(batch, "FPS: "+Gdx.graphics.getFramesPerSecond(),2,2);
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
    
    public void initTextures(){
        manager.load("blocks/stone.png",Texture.class);
    }
    
    public void initBlocks(){
        Texture stoneTexture = manager.get("blocks/stone.png");
        Block stone = new Block(1, stoneTexture,"Камень");
        blocks.put(stone.getId(),stone);
    }

}

