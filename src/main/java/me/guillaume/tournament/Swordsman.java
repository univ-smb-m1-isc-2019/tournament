package me.guillaume.tournament;

import static java.lang.Math.max;

public class Swordsman {

    private int hitPoints;
    private Weapon weapon;

    public Swordsman(String vicious) {
        this();
    }

    public Swordsman() {
        hitPoints = 100;
        weapon = new Sword();
    }

    public void engage(Viking viking) {
        new Fight(this, viking).run();
    }

    public int hitPoints() {
        return hitPoints;
    }

    public Swordsman equip(String buckler) {
        return null;
    }

    public void engage(Highlander highlander) {

    }

    public void hit(Viking viking) {
        viking.hitBy(weapon);
    }

    public void hitBy(Weapon weapon) {
        hitPoints = max(0, hitPoints - weapon.damage());
    }

    public boolean isDead() {
        return hitPoints <= 0;
    }
}
