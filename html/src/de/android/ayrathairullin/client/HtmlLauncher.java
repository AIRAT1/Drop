package de.android.ayrathairullin.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import de.android.ayrathairullin.Drop;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(800, 480); // set current width and height
        }

        @Override
        public ApplicationListener createApplicationListener () {
                return new Drop();
        }
}