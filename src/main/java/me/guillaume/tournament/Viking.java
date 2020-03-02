package me.guillaume.tournament;

public class Viking {

    private Axe axe = new Axe(6);
    private int hitPoints = 120;

    public int hitPoints() {
        return hitPoints;
    }

    public Viking equip(String buckler) {
        return null;
    }

    public void hit(Swordsman swordsman) {
        swordsman.hitBy(axe);
    }

    public void hitBy(Sword sword) {
        hitPoints = Math.max(0, hitPoints - sword.damage());
    }

    public boolean isDead() {
        return hitPoints <= 0;
    }

}
