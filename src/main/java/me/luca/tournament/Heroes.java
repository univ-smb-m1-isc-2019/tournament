package me.luca.tournament;

public class Heroes {

    protected String name;

    public Heroes() {
        this.name = "";
    }

    public Heroes(String name) {
        this.name = name;
    }
    public void engage(Heroes h) {
    }

    public boolean hitPoints() {
        return true;
    }

    public Heroes equip(String buckler) {

        return this;
    }
}
