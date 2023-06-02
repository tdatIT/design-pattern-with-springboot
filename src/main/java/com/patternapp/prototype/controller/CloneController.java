package com.patternapp.prototype.controller;

import com.patternapp.prototype.model.Bike;
import com.patternapp.prototype.model.Car;
import com.patternapp.prototype.model.CloneResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/prototype-pattern")
public class CloneController {
    @GetMapping("/clone-car")
    public ResponseEntity<CloneResponse> getPrototypeCar(@RequestBody Car oldCar, @RequestParam int number) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            cars.add((Car) oldCar.clone());
        }
        return ResponseEntity.ok(new CloneResponse(oldCar, cars));
    }

    @GetMapping("/clone-bike")
    public ResponseEntity<CloneResponse> getPrototypeBike(@RequestBody Bike oldBike, @RequestParam int number) {
        List<Bike> bikes = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            bikes.add((Bike) oldBike.clone());
        }
        return ResponseEntity.ok(new CloneResponse(oldBike, bikes));
    }
}
