package com.chinmay.daggerexample.models.dagger;

import com.chinmay.daggerexample.models.car.DieselEngine;
import com.chinmay.daggerexample.models.car.Engine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by grandolf49 on 19-05-2020
 */
@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
