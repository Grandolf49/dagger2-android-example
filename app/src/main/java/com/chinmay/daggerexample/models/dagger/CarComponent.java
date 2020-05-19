package com.chinmay.daggerexample.models.dagger;

import com.chinmay.daggerexample.MainActivity;
import com.chinmay.daggerexample.models.car.Car;
import com.chinmay.daggerexample.models.car.DieselEngine;

import dagger.Component;

/**
 * Created by grandolf49 on 12-05-2020
 */
@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
