package me.guillaume.tournament;

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
