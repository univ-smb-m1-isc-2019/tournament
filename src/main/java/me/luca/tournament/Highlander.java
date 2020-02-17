package me.luca.tournament;

public class Highlander extends Heroes {
    public Highlander(String name) {
        super(name);
    }

    public Highlander() {
        super.name = "Highlander";
    }

    public Highlander equip(String buckler) {

        return this;
    }
}
