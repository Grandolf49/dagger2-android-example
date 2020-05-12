package com.chinmay.daggerexample.models;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by grandolf49 on 12-05-2020
 */
public class Car {
    private static final String TAG = "Car";

    private Engine engine;

    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "driving...");
    }
}
