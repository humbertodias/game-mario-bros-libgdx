package com.polygongames.mario.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.polygongames.mario.SuperMario;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Super Mario Practice");
		config.setWindowedMode(800, 600);
		new Lwjgl3Application(new SuperMario(), config);
	}
}
