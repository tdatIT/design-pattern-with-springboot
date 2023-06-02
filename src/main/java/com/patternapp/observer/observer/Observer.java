package com.patternapp.observer.observer;


import com.patternapp.observer.subject.Subject;

public abstract class Observer {
    protected Subject subject;

    public abstract String getString();

    public abstract void update();
}
