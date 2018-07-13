package com.chowbus.flickrphotos.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.chowbus.flickrphotos.R;
import com.chowbus.flickrphotos.activities.BaseActivity;

public abstract class BaseFragment extends Fragment {

    protected static String TAG = BaseFragment.class.getSimpleName();

    public void showSuccessNotificationBar(String message) {
        BaseActivity activity = (BaseActivity) getActivity();
        if (activity != null)
            activity.showSuccessNotificationBar(message);
    }

    public void showErrorNotificationBar(String message) {
        BaseActivity activity = (BaseActivity) getActivity();
        if (activity != null)
            activity.showErrorNotificationBar(message);
    }

    protected void  startFragment(int frameLayoutId, Fragment f) {
        startFragment(frameLayoutId, f, true, null);
    }

    protected void startFragment(int frameLayoutId, Fragment f, boolean addToBackStack, String tag) {
        if (getActivity() == null)      return;
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(frameLayoutId, f);
        if(addToBackStack) {
            fragmentTransaction.addToBackStack(tag);
        }
        fragmentTransaction.commit();
    }
}
