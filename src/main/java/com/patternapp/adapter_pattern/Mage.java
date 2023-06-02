package com.patternapp.adapter_pattern;

public class Mage implements AdvancedCharacter{

    public Mage() {
    }

    @Override
    public void useMagicWand(String comsuming) {
        System.out.println("Mage use wand and comsuming: " + comsuming);
    }

    @Override
    public void useSword(String comsuming) {
        //
    }
}
