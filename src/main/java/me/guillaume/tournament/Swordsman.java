package me.guillaume.tournament;

public class Swordsman extends Fighter {
    public Swordsman() {
    }

    public Swordsman(String state) {
        super(state);
    }

    public Swordsman equip(String portable) {
        super.equip(portable);
        return this;
    }
}
