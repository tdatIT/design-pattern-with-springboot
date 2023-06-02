package com.patternapp.singleton_pattern;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance = null;

    private LazyInitializedSingleton() {
        System.out.println("Instance created");
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }

        System.out.println("Get instance");
        return instance;
    }
}
