package me.guillaume.tournament;

import static java.lang.Math.max;

public class Swordsman {

    private int hitPoints;
    private Weapon weapon;
    private Buckler buckler;

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

    public Swordsman equip(String equipment) {
        if ("buckler".equals(equipment)) {
            buckler = new Buckler();
        }
        return this;
    }

    public void engage(Highlander highlander) {

    }

    public void hit(Viking viking) {
        viking.hitBy(weapon);
    }

    public void hitBy(Weapon weapon) {

        if (buckler != null && buckler.canBlock(weapon)) {
            return;
        }

        hitPoints = max(0, hitPoints - weapon.damage());
    }

    public boolean isDead() {
        return hitPoints <= 0;
    }
}
