package com.patternapp.decorator.model;

public class AirBag extends CarDecorator {
    public AirBag(ICar _car) {
        super(_car);
    }

    @Override
    public double info() {
        return _car.info() + addAirTag();
    }

    private double addAirTag() {
        return 4000.34D;
    }
}
