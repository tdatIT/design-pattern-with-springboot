package com.patternapp.adapter_pattern;

public class Knight implements AdvancedCharacter{
    public Knight() {
    }

    @Override
    public void useMagicWand(String comsuming) {
        //
    }

    @Override
    public void useSword(String comsuming) {
        System.out.println("Knight use sword and comsuming: " + comsuming);
    }
}
