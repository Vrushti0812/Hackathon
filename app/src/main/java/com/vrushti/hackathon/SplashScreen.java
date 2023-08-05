package com.vrushti.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private static final int SPLASH_DURATION = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // Launch the main activity after the splash duration
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish(); // Finish the splash activity so the user can't go back to it by pressing back button
            }
            },
                SPLASH_DURATION);

    }
}