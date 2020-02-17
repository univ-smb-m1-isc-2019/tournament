package me.luca.tournament;

public class Heroes {

    protected String name;
    protected int pv;
    protected  Equipment equipment;

    public Heroes() {
        this.name = "";
    }

    public Heroes(String name) {
        this.name = name;
    }
    public void engage(Heroes h) {
    }

    public int  hitPoints() {
        return this.pv;
    }

    public Heroes equip(String buckler) {

        return this;
    }
}
