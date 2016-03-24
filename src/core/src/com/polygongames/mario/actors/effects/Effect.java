package com.polygongames.mario.actors.effects;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.polygongames.mario.actors.RigidBody;
import com.polygongames.mario.screens.PlayScreen;

/**
 *
 *
 * Effect
 */
public abstract class Effect extends RigidBody {

    protected TextureAtlas textureAtlas;

    public Effect(PlayScreen playScreen, float x, float y) {
        super(playScreen, x, y);
        this.textureAtlas = playScreen.getTextureAtlas();

    }

}
