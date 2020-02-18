package me.guillaume.tournament.fighters;

public class Highlander extends Fighter {
    public Highlander() {
    }

    public Highlander(String state) {
        super(state);
    }

    public Highlander equip(String portable) {
        super.equip(portable);
        return this;
    }
}
