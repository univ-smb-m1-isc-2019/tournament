package me.guillaume.tournament.fighters.weapons;

import me.guillaume.tournament.fighters.Portable;

public abstract class Weapon extends Portable {
    protected int dmg;

    public Weapon() {
        super();
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getDmg() {
        return dmg;
    }

    public boolean canGiveABlow() {
        return true;
    }

    public void giveABlow() {

    }
}
