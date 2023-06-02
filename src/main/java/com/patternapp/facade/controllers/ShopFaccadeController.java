package com.patternapp.facade.controllers;

import java.util.Map;

import com.patternapp.facade.facade.ShopFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rest/v1/shops")
public class ShopFaccadeController {

    private final ShopFacade shopFacade;

    public ShopFaccadeController(ShopFacade shopFacade) {
        this.shopFacade = shopFacade;
    }

    @GetMapping("/{compoType}")
    public ResponseEntity<String> getCombo1(@PathVariable String compoType,
            @RequestParam Map<String, String> requestParams) {
        String response = "";
        if (compoType.equalsIgnoreCase("combo_1")) {
            String email = requestParams.get("email");
            response = shopFacade.buyProductByCashWithFreeShipping(email);
            return new ResponseEntity<String>(response, HttpStatus.OK);
        }
        if (compoType.equalsIgnoreCase("combo_2")) {
            String email = requestParams.get("email");
            String mobilePhone = requestParams.get("mobilePhone");
            response = shopFacade.buyProductByPaypalWithStandardShipping(email, mobilePhone);
            return new ResponseEntity<String>(response, HttpStatus.OK);
        }
        return new ResponseEntity<String>("Not found combo: " + compoType, HttpStatus.OK);
    }
}
