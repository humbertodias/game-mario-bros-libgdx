package com.polygongames.mario.actors.enemies;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.polygongames.mario.actors.Mario;
import com.polygongames.mario.actors.RigidBody;
import com.polygongames.mario.screens.PlayScreen;

/**
 *
 *
 * Enemy
 */
public abstract class Enemy extends RigidBody {

    protected TextureAtlas textureAtlas;

    protected boolean active = false;

    public Enemy(PlayScreen playScreen, float x, float y) {
        super(playScreen, x, y);
        this.textureAtlas = playScreen.getTextureAtlas();
    }

    public abstract void getDamage(int damage);

    public void interact(Mario mario) {

    }

}
