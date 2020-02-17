package me.luca.tournament;

public class Viking extends Heroes {
    public Viking(String name) {
        super(name);
    }

    public Viking() {
        super.name = "Viking";
    }

    public Viking equip(String buckler) {

        return this;
    }
}
