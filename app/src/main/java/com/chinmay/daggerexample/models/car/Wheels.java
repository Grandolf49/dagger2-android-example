package com.chinmay.daggerexample.models.car;

/**
 * Created by grandolf49 on 12-05-2020
 */
public class Wheels {
    /**
     * We don't own this class so we can't annotate it with @Inject
     */

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
