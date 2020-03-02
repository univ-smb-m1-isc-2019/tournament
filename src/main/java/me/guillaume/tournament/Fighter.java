package me.guillaume.tournament;

import static java.lang.Math.max;

public class Fighter {

    protected int hitPoints;

    protected Weapon weapon;
    protected Buckler buckler;

    public Fighter(Weapon weapon, int hitPoints) {
        this.weapon = weapon;
        this.hitPoints = hitPoints;
    }

    public int hitPoints() {
        return hitPoints;
    }

    public void hit(Fighter fighter) {
        fighter.hitBy(weapon);
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
