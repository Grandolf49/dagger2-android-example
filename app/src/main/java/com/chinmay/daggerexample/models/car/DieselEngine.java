package com.chinmay.daggerexample.models.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by grandolf49 on 19-05-2020
 */
public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started");
    }
}
