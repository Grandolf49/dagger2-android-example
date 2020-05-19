package com.chinmay.daggerexample.models.dagger;

import com.chinmay.daggerexample.models.car.Engine;
import com.chinmay.daggerexample.models.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by grandolf49 on 19-05-2020
 */
@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
