package me.luca.tournament;

public class Viking extends Heroes {
    public Viking(String name) {
        super(name);
        super.pv = 120;

    }

    public Viking() {
        super.name = "Viking";
        super.pv = 120;

    }

    public Viking equip(String buckler) {

        return this;
    }
}