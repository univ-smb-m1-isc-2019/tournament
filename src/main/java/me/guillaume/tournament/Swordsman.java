package me.guillaume.tournament;

public class Swordsman {

    private int hitPoints = 100;
    private Sword sword = new Sword(5);

    public Swordsman(String vicious) {

    }

    public Swordsman() {

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
        viking.hitBy(sword);
    }

    public void hitBy(Axe axe) {
        hitPoints = Math.max(0, hitPoints - axe.damage());
    }

    public boolean isDead() {
        return hitPoints <= 0;
    }
}
