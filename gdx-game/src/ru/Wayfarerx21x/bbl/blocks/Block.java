package ru.Wayfarerx21x.bbl.blocks;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.SpriteCache;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.Texture;

public class Block {
    private Vector2 coords;
    private int id;
    private String title;
    private Vector2 size;
    private Texture texture;
    
    public Block(int id, Texture texture, String title){
        this.id = id;
        this.title = title;
        this.texture = texture;
    }

    
    public void draw(SpriteBatch batch,float x,float y){
        batch.draw(this.texture,x,y,1,1);
    }
    
    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Texture getTexture() {
        return texture;
    }
    
    public void setCoords(Vector2 coords) {
        this.coords = coords;
    }

    public Vector2 getCoords() {
        return coords;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSize(Vector2 size) {
        this.size = size;
    }

    public Vector2 getSize() {
        return size;
    }
    
}
