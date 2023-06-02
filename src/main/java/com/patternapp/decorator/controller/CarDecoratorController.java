package com.patternapp.decorator.controller;

import com.patternapp.decorator.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/design-pattern")
public class CarDecoratorController {


    @PostMapping("/order-car-decorator")
    public ResponseEntity<String> orderCar(@RequestBody OrderBody body) {
        double price = 0D;
        String name = "No name";
        ICar car = null;
        switch (body.getCar_name()) {
            case ICar.TOYOTA_CAMRY:
                car = new ToyotaCamry();
                name = "TOYOTA CAMRY 2.5HV - 2023";
                price = car.info();
                break;
            case ICar.KIA_MORNING:
                car = new KiaMorning();
                name = "KIA Morning 2022 - MT";
                price = car.info();
                break;
            case ICar.HONDA_CIVIC:
                car = new HondaCivic();
                name = "Honda Civic RS 2021 - iVTEC - 1.8L Turbo";
                price = car.info();
                break;
        }
        StringBuilder option_str = new StringBuilder();
        if (car != null) {
            for (int option : body.getOptions()) {
                switch (option) {
                    case 1:
                        CarDecorator color_option = new RedColor(car);
                        price = color_option.info();
                        option_str.append("red color,");
                        break;
                    case 2:
                        CarDecorator warranty_option = new WarrantyExtend(car);
                        price = warranty_option.info();
                        option_str.append("warranty extend,");
                        break;
                    case 3:
                        CarDecorator airBag_option = new AirBag(car);
                        price = airBag_option.info();
                        option_str.append("air bag,");
                        break;
                }
            }
        }
        return ResponseEntity.ok("Car name: " + name + " - option:" + option_str + " - price:" + price + " USD");
    }
}
