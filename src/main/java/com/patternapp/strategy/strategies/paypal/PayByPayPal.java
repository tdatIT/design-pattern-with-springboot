package com.patternapp.strategy.strategies.paypal;


import com.patternapp.strategy.strategies.PayStrategy;

public class PayByPayPal implements PayStrategy {
    private int paymentAmount;

    public PayByPayPal(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public void pay() {
        verifyAccount();
        System.out.println("Paying " + paymentAmount + " using PayPal.");
    }

    private void verifyAccount() {
        System.out.println("PayPal verification has been successful.");
    }
}
