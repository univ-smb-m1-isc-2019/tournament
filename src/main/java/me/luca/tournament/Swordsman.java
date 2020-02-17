package me.luca.tournament;

public class Swordsman extends Heroes {
    public Swordsman(String name) {
        super(name);
    }

    public Swordsman() {
        super.name = "Swordsman";
    }

    public Swordsman equip(String buckler) {

        return this;
    }
}
