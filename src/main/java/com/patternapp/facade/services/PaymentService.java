package com.patternapp.facade.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public String paymentBy(String paymentType) {
        if (paymentType.equalsIgnoreCase("paypal")) {
            return String.format("Payment by %s", paymentType.toUpperCase());
        }
        if (paymentType.equalsIgnoreCase("creadit cart")) {
            return String.format("Payment by %s", paymentType.toUpperCase());
        }
        if (paymentType.equalsIgnoreCase("e-banking account")) {
            return String.format("Payment by %s", paymentType.toUpperCase());
        }
        if (paymentType.equalsIgnoreCase("cash")) {
            return String.format("Payment by %s", paymentType.toUpperCase());
        }
        return null;
    }
}
