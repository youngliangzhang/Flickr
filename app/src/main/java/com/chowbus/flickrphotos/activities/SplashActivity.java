package com.chowbus.flickrphotos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.chowbus.flickrphotos.R;

public class SplashActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 1500);
    }

    @Override
    public void showSuccessNotificationBar(String message) { }

    @Override
    public void showErrorNotificationBar(String message) { }
}
