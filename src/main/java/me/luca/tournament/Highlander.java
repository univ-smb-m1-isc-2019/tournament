package me.luca.tournament;

public class Highlander extends Heroes {
    public Highlander(String name) {
        super(name);
        super.pv =150;

    }

    public Highlander() {
        super.name = "Highlander";
        super.pv =150;
    }

    public Highlander equip(String buckler) {

        return this;
    }
}
