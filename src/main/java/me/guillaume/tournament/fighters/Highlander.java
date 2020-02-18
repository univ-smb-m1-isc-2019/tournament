package me.guillaume.tournament.fighters;

import me.guillaume.tournament.fighters.weapons.GreatSword;

public class Highlander extends Fighter {
    public Highlander() {
        setHp(150);
        setWeapon(new GreatSword());
    }

    public Highlander(String state) {
        super(state);
    }

    public Highlander equip(String portable) {
        super.equip(portable);
        return this;
    }
}
