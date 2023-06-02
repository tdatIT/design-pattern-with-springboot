package com.patternapp.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bike implements VehicleCloneable {
    public String name;
    public String type;
    public double price;

    @Override
    public VehicleCloneable clone() {
        return new Bike(this.name, this.type, this.price);
    }
}
