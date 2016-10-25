package com.example.mihai.realplay;

import android.app.Activity;
import android.os.Handler;
import android.os.Bundle;
import android.view.Window;

import com.example.mihai.realplay.Utils.Util;

public class SplashScreen extends Activity {

    private final int SPLASH_SCREEN_DURATION = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Util.openActivityClosingParent(SplashScreen.this, LoginActivity.class);
            }
        }, SPLASH_SCREEN_DURATION);
    }
}
