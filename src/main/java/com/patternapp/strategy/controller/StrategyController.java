package com.patternapp.strategy.controller;


import com.patternapp.strategy.context.Order;
import com.patternapp.strategy.strategies.PayStrategy;
import com.patternapp.strategy.strategies.creditcard.PayByCreditCard;
import com.patternapp.strategy.strategies.paypal.PayByPayPal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/strategy")
public class StrategyController {
    @SuppressWarnings("rawtypes")
	@GetMapping
    public ResponseEntity getStrategy() {

        List<PayStrategy> payStrategyList = new ArrayList<>();
        PayStrategy payStrategy1 = new PayByCreditCard(10);
        payStrategyList.add(payStrategy1);

        PayStrategy payStrategy2 = new PayByPayPal(50);
        payStrategyList.add(payStrategy2);

        Order order = new Order();

        payStrategyList.forEach(payStrategy -> order.processOrder(payStrategy));

        return ResponseEntity.noContent().build();
    }
}
