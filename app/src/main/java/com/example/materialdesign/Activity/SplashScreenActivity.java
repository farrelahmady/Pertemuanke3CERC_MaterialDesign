package com.example.materialdesign.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.materialdesign.R;

public class SplashScreenActivity extends AppCompatActivity {


    private int waktu_loading = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        initSplash();
    }

    private void initSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intro = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(intro);
                finish();
                overridePendingTransition(0, 0);
                getIntent().addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            }
        }, waktu_loading);
    }
}