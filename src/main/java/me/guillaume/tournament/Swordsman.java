package me.guillaume.tournament;

public class Swordsman extends Champion{

    public Swordsman(String name) {
        super(name);
    }

    public Swordsman() {
        super.name = "Viking";
    }

    public boolean hitPoints() {
        return false;
    }

    public Swordsman equip(String buckler) {

        return this;
    }
}
