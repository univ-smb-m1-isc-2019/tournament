package me.luca.tournament;

public class Armor extends Equipment{
    public Armor(String name, int i) {
        super(name, i);
    }

    @Override
    public int getDmg() {
        return 0;
    }

    @Override
    public int getDura() {
        return 0;
    }

    @Override
    public int hit() {
        return 0;
    }
}
