package me.guillaume.tournament;

import java.util.ArrayList;

public abstract class Fighter {
    protected int hp;
    protected int dmg;
    protected ArrayList<Portable> arms;

    public Fighter() {
    }

    public Fighter(String state) {
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int hitPoints() {
        return hp;
    }

    public Fighter equip(String portable) {
        return this;
    }

    public void engage(Fighter other) {
        new Fight(this, other);
    }
}
