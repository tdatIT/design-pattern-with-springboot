package com.patternapp.observer.observer;


import com.patternapp.observer.subject.Subject;

public class OctalObserver extends Observer {
    private String octalString;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        octalString = "Octal String: " + Integer.toOctalString(subject.getState());
    }

    @Override
    public String getString() {
        return octalString;
    }
}
