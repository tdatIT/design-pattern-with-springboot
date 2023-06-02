package com.patternapp.builder.controller;


import com.google.gson.JsonObject;
import com.patternapp.builder.builders.CarBuilder;
import com.patternapp.builder.builders.CarManualBuilder;
import com.patternapp.builder.cars.Car;
import com.patternapp.builder.cars.Manual;
import com.patternapp.builder.director.Director;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
public class BuilderController {
    @SuppressWarnings("rawtypes")
	@GetMapping
    public ResponseEntity getBuilder() {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
        
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("carType", car.getType().name());

        return ResponseEntity.ok().body(jsonObject.toString());
    }
}
