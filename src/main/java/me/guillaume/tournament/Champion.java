package me.guillaume.tournament;

public class Champion {
    protected String name;

    public Champion() {
        this.name = "";
    }

    public Champion(String name) {
        this.name = name;
    }
    public void engage(Champion champ) {
    }

    public boolean hitPoints() {
        return true;
    }

    public Champion equip(String buckler) {

        return this;
    }
}