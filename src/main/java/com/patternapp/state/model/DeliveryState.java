package com.patternapp.state.model;

public class DeliveryState implements OrderState {
    @Override
    public String handle() {
        return "Viettel Post";
    }
}
