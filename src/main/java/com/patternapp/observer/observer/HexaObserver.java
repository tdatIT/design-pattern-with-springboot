package com.patternapp.observer.observer;


import com.patternapp.observer.subject.Subject;

public class HexaObserver extends Observer {
    private String hexString;

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        hexString = "Hex String: " + Integer.toHexString(subject.getState()).toUpperCase();
    }

    @Override
    public String getString() {
        return hexString;
    }
}
