package com.chinmay.daggerexample;

import com.chinmay.daggerexample.models.Car;
import com.chinmay.daggerexample.models.WheelsModule;

import dagger.Component;

/**
 * Created by grandolf49 on 12-05-2020
 */
@Component(modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
