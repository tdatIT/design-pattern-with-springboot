package com.patternapp.decorator.model;

public class RedColor extends CarDecorator {
    public RedColor(ICar _car) {
        super(_car);
    }

    @Override
    public double info() {
        return _car.info() + addRedColor();
    }

    public double addRedColor() {
        return 1000D;
    }
}
