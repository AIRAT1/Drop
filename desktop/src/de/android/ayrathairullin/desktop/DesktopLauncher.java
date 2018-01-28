package de.android.ayrathairullin.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.android.ayrathairullin.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Drop"; // set title
		config.width = 800; // set current width
		config.height = 480; // set current height
		new LwjglApplication(new Drop(), config);
	}
}
