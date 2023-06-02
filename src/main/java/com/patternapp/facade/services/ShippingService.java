
package com.patternapp.facade.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public String getShipping(String shipType) {
        if (shipType.equalsIgnoreCase("free")) {
            return String.format("%s Shipping", shipType.toUpperCase());
        }
        if (shipType.equalsIgnoreCase("standard")) {
            return String.format("%s Shipping", shipType.toUpperCase());
        }
        if (shipType.equalsIgnoreCase("express")) {
            return String.format("%s Shipping", shipType.toUpperCase());
        }
        return null;
    }
}