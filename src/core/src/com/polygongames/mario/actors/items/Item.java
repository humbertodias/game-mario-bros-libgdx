package com.polygongames.mario.actors.items;

import com.polygongames.mario.actors.RigidBody;
import com.polygongames.mario.screens.PlayScreen;

/**
 *
 *
 * Item
 */
public abstract class Item extends RigidBody {

    protected String name = "item";

    public Item(PlayScreen playScreen, float x, float y) {
        super(playScreen, x, y);
    }

    public String getName() {
        return name;
    }

    public abstract void use();

}
