package me.guillaume.tournament;

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
}
