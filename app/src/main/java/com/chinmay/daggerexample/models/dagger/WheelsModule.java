package com.chinmay.daggerexample.models.dagger;

import com.chinmay.daggerexample.models.car.Rims;
import com.chinmay.daggerexample.models.car.Tires;
import com.chinmay.daggerexample.models.car.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * Created by grandolf49 on 19-05-2020
 */
@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
