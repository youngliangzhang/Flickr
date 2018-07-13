package com.chowbus.flickrphotos.activities;

import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public abstract void showSuccessNotificationBar(String message);
    public abstract void showErrorNotificationBar(String message);

}
