package com.patternapp.state.model;

import java.util.UUID;

public class PendingState implements OrderState {
    @Override
    public String handle() {
        //create order id;
        return UUID.randomUUID().toString();
    }
}
