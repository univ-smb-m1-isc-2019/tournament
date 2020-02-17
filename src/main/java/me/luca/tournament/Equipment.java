package me.luca.tournament;

public class Equipment {

    private final String name;
    private final int dmg;

    public int getDmg() {
        return dmg;
    }

    public Equipment(String name, int dmg) {
        this.name = name;
        this.dmg = dmg;
    }
}
