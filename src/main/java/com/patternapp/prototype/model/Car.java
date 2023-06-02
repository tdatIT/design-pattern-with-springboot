package com.patternapp.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements VehicleCloneable {
    public String name;
    public String engine;
    public float price;

    @Override
    public VehicleCloneable clone() {
        return new Car(this.name, this.engine, this.price);
    }
}
