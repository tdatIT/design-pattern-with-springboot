package com.patternapp.decorator.model;

import lombok.Data;

@Data
public class ToyotaCamry implements ICar {
    @Override
    public double info() {
        //System.out.println("TOYOTA CAMRY 2.5HV - 2023");
        return 63653.66D;
    }
}
