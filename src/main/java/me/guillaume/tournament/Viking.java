package me.guillaume.tournament;

import static java.lang.Math.max;

public class Viking {

    private Weapon weapon;
    private int hitPoints;
    private Buckler buckler;

    public Viking() {
        weapon = new Axe();
        hitPoints = 120;
    }

    public int hitPoints() {
        return hitPoints;
    }

    public Viking equip(String equipment) {
        if ("buckler".equals(equipment)) {
            buckler = new Buckler();
        }
        return this;
    }

    public void hit(Swordsman swordsman) {
        swordsman.hitBy(weapon);
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
