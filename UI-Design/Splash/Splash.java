package com.khalnayak.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler sp = new Handler();
        sp.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(Splash.this, com.khalnayak.splash.MainActivity.class);
                startActivity(in);
                finish();
            }
        }, 3001);
    }
}

