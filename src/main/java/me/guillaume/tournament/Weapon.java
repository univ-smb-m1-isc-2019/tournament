package me.guillaume.tournament;

public class Weapon {

    private final int dmg;

    public Weapon(int dmg) {
        this.dmg = dmg;
    }

    public int damage() {
        return dmg;
    }
}
