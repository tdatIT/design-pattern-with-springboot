package com.patternapp.adapter_pattern;

public class CharacterAdapter implements Character {
    AdvancedCharacter advancedCharacter;

    public CharacterAdapter(String weapon) {
        if (weapon.equalsIgnoreCase("wand")) {
            this.advancedCharacter = new Mage();
        } else if (weapon.equalsIgnoreCase("sword")) {
            this.advancedCharacter = new Knight();
        }
    }

    @Override
    public void use(String weapon, String comsuming) {
        if (weapon.equalsIgnoreCase("wand")) {
            this.advancedCharacter.useMagicWand(comsuming);
        } else if (weapon.equalsIgnoreCase("sword")) {
            this.advancedCharacter.useSword(comsuming);
        }
    }
}
