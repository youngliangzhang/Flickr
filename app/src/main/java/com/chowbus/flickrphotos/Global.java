package com.chowbus.flickrphotos;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.chowbus.flickrphotos.model.Photo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import static com.chowbus.flickrphotos.api.ServerConfig.SECRET_KEY;
import static java.util.Calendar.DAY_OF_MONTH;

public class Global {

    public static void hideKeyboard(Activity act) {
        View view = act.getCurrentFocus();
        if (view != null) {
            InputMethodManager inputManager = (InputMethodManager) act.getSystemService(Context.INPUT_METHOD_SERVICE);
            if (inputManager != null)
                inputManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static String getYesterdayDateString() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(DAY_OF_MONTH, calendar.get(DAY_OF_MONTH) - 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd", Locale.getDefault());
        return dateFormat.format(calendar.getTime());
    }

    public static String getFlickrImageUrl(Photo photo, boolean isLarge) {
        return String.format(Locale.getDefault(), "https://farm%d.staticflickr.com/%d/%d_%s_%s.jpg",
                photo.getFarm(), getIntFromString(photo.getServer()), getIntFromString(photo.getId()), getIntFromString(photo.getSecret()), isLarge ? "b" : "z");
    }

    public static int getIntFromString(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            return 0;
        }
    }
}
