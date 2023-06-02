package com.patternapp.decorator.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class CarDecorator implements ICar {
    protected ICar _car;
}
