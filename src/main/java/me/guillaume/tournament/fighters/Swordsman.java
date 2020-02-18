package me.guillaume.tournament.fighters;

import me.guillaume.tournament.fighters.weapons.OneHandSword;

public class Swordsman extends Fighter {
    public Swordsman() {
        setHp(100);
        setWeapon(new OneHandSword());
    }

    // TODO A corriger.
    public Swordsman(String state) {
        super(state);
    }

    public Swordsman equip(String portable) {
        super.equip(portable);
        return this;
    }
}
