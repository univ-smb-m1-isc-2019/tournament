package me.guillaume.tournament;

public abstract class Weapon extends Portable {
    protected int dmg;

    public Weapon(Fighter owner) {
        super(owner);
        owner.setDmg(dmg);
    }
}
