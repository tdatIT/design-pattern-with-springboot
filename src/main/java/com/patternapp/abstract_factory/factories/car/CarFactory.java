package com.patternapp.abstract_factory.factories.car;


import com.patternapp.abstract_factory.components.Vehicle;
import com.patternapp.abstract_factory.components.car.MegaCar;
import com.patternapp.abstract_factory.components.car.MicroCar;
import com.patternapp.abstract_factory.factories.VehicleFactory;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("mega")) {
            return new MegaCar();
        } else if (vehicleType.equalsIgnoreCase("micro")) {
            return new MicroCar();
        }
        return null;
    }
}
