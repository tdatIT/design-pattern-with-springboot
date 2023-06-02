package com.patternapp.observer.observer;


import com.patternapp.observer.subject.Subject;

public class BinaryObserver extends Observer {

    private String binaryString;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public String getString() {
        // TODO Auto-generated method stub
        return binaryString;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        binaryString = "Binary String: " + Integer.toBinaryString(subject.getState());
    }

}
