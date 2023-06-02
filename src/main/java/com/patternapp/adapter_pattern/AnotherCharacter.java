package com.patternapp.adapter_pattern;

public class AnotherCharacter implements Character {
    CharacterAdapter characterAdapter;

    public AnotherCharacter() {
    }

    @Override
    public void use(String weapon, String comsuming) {
        if (weapon.equalsIgnoreCase("bow")) {
            System.out.println("Character use bow and comsuming:" + comsuming);
        } else if (!weapon.equalsIgnoreCase("sword") && !weapon.equalsIgnoreCase("wand")) {
            System.out.println("Character not valid");
        } else {
            this.characterAdapter = new CharacterAdapter(weapon);
            this.characterAdapter.use(weapon, comsuming);
        }
    }
}
