package me.guillaume.tournament.fighters;

import me.guillaume.tournament.fighters.weapons.OneHandAxe;

public class Viking extends Fighter {
    public Viking() {
        setHp(120);
        setWeapon(new OneHandAxe());
    }

    public Viking(String state) {
        super(state);
    }

    public Viking equip(String portable) {
        super.equip(portable);
        return this;
    }
}
