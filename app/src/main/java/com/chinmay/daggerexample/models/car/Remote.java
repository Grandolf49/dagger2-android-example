package com.chinmay.daggerexample.models.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by grandolf49 on 12-05-2020
 */
public class Remote {
    private static final String TAG = "Remote";

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote Connected: ");
    }
}
