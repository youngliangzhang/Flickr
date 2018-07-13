package com.chowbus.flickrphotos.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

import com.chowbus.flickrphotos.R;
import com.chowbus.flickrphotos.fragments.MainFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.cl_main)
    ConstraintLayout clMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getSupportFragmentManager().beginTransaction().add(R.id.fl_main, new MainFragment(), "Main").commit();
    }

    @Override
    public void showSuccessNotificationBar(String message) {
        Snackbar snackbar = Snackbar.make(clMain, message, Snackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.LTGRAY);
        View snackBar = snackbar.getView();
        snackBar.setBackgroundResource(R.color.success_notification_bar);
        TextView textView = snackBar.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(getResources().getColor(R.color.success_notification_bar_text));
        snackbar.show();
    }

    @Override
    public void showErrorNotificationBar(String message) {

        Snackbar snackbar = Snackbar.make(clMain, message, Snackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.LTGRAY);
        View snackBar = snackbar.getView();
        snackBar.setBackgroundResource(R.color.error_notification_bar);
        TextView textView = snackBar.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(getResources().getColor(R.color.error_notification_bar_text));
        snackbar.show();

    }
}
