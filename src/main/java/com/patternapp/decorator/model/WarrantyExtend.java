package com.patternapp.decorator.model;

public class WarrantyExtend extends CarDecorator {
    public WarrantyExtend(ICar _car) {
        super(_car);
    }

    @Override
    public double info() {
        return _car.info() + addWarranty();
    }

    public double addWarranty() {
        return 5000.99D;
    }
}
