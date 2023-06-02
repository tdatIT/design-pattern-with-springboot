package com.patternapp.state.model;

import java.util.Date;

public class CompleteState implements OrderState {
    @Override
    public String handle() {
        return new Date().getTime() + "";
    }
}
