package com.patternapp.abstract_factory.services;


import com.patternapp.abstract_factory.factories.VehicleFactory;

public interface VehicleFactoryService {
    VehicleFactory getVehicleFactory(String vehicleType);
}
