package com.patternapp.abstract_factory.services;


import com.patternapp.abstract_factory.factories.VehicleFactory;
import com.patternapp.abstract_factory.factories.bike.BikeFactory;
import com.patternapp.abstract_factory.factories.car.CarFactory;
import org.springframework.stereotype.Service;

@Service
public class VehicleFactoryServiceImpl implements VehicleFactoryService {

    @Override
    public VehicleFactory getVehicleFactory(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("car")) {
            return new CarFactory();
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            return new BikeFactory();
        }
        return null;
    }

}
