package com.patternapp.strategy.context;


import com.patternapp.strategy.strategies.PayStrategy;

public class Order {
    public void processOrder(PayStrategy strategy) {
        strategy.pay();
        // Here we could collect and store payment data from the strategy.
    }
}
