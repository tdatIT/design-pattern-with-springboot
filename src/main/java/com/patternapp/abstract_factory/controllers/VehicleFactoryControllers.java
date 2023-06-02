package com.patternapp.abstract_factory.controllers;

import com.patternapp.abstract_factory.components.Vehicle;
import com.patternapp.abstract_factory.factories.VehicleFactory;
import com.patternapp.abstract_factory.services.VehicleFactoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1/vehicles")
public class VehicleFactoryControllers {

    private final VehicleFactoryService vehicleService;
    private VehicleFactory vehicleFactory;
    private Vehicle vehicle;

    public VehicleFactoryControllers(VehicleFactoryService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/{vehicleType}/{type}")
    public ResponseEntity<String> createVehicle(@PathVariable String vehicleType, @PathVariable String type) {
        vehicleFactory = vehicleService.getVehicleFactory(vehicleType);
        if (vehicleFactory == null) {
            return new ResponseEntity<String>("Not found factory: " + vehicleType, HttpStatus.BAD_REQUEST);
        }
        vehicle = vehicleFactory.getVehicle(type);
        if (vehicle == null) {
            return new ResponseEntity<String>("Not found vehicle: " + vehicleType + ": " + type,
                    HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(vehicle.createVehicle(), HttpStatus.OK);
    }
}
