package me.guillaume.tournament;

import java.util.ArrayList;

public abstract class Fighter {
    protected int hp;
    protected int dmg;
    protected ArrayList<Portable> arms = new ArrayList<>();

    public Fighter() {
    }

    public Fighter(String state) {
    }

    public int getDmg() {
        return dmg;
    }

    protected void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public void hit(Fighter other) {
        other.getHitBy(this);
    }

    protected void getHitBy(Fighter other) {
        setHp(Math.max(0, hitPoints() - other.getDmg()));
    }
}
