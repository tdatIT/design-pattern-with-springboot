package com.patternapp.decorator.model;

import lombok.Data;

@Data
public class KiaMorning implements ICar {
    @Override
    public double info() {
        //System.out.println("KIA Morning 2022 - MT");
        return 10370.0D;
    }
}
