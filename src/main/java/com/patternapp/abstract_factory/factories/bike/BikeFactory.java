package com.patternapp.abstract_factory.factories.bike;


import com.patternapp.abstract_factory.components.Vehicle;
import com.patternapp.abstract_factory.components.bike.NormalBike;
import com.patternapp.abstract_factory.components.bike.SportsBike;
import com.patternapp.abstract_factory.factories.VehicleFactory;

public class BikeFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("normal")) {
            return new NormalBike();
        } else if (vehicleType.equalsIgnoreCase("sports")) {
            return new SportsBike();
        }
        return null;
    }

}
