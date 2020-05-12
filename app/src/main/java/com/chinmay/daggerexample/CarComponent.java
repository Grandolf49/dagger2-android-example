package com.chinmay.daggerexample;

import com.chinmay.daggerexample.models.Car;

import dagger.Component;

/**
 * Created by grandolf49 on 12-05-2020
 */
@Component
public interface CarComponent {

    void inject(MainActivity mainActivity);
}
