package com.patternapp.abstract_factory.factories;


import com.patternapp.abstract_factory.components.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String vehicleType);
}
