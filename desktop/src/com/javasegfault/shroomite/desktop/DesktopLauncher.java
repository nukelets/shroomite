package com.javasegfault.shroomite.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.javasegfault.shroomite.Shroomite;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Shroomite";
		config.width = 1366;
		config.height = 720;
        config.foregroundFPS = 120;
		new LwjglApplication(new Shroomite(), config);
	}
}
