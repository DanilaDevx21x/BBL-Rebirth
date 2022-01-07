package ru.Wayfarerx21x.bbl;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import android.view.View;

public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		getActionBar().hide();
		hideStatusBar(true);
		hideNavigationBar();
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
//Ваш класс

        initialize(new MyGdxGame(), cfg);
    }

	protected void hideNavigationBar(){

		View decorView = getWindow().getDecorView(); 
		int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | 
			View.SYSTEM_UI_FLAG_FULLSCREEN |
			View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|
			View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
			View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
			View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
		decorView.setSystemUiVisibility(uiOptions);
	}

	@Override
	protected void onResume(){
		super.onResume();
		hideNavigationBar();
	}
}

