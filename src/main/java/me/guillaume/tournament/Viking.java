package me.guillaume.tournament;

public class Viking extends Champion {

    public Viking(String name) {
        super(name);
    }

    public Viking() {
        super.name = "Viking";
    }

    public boolean hitPoints() {
        return false;
    }

    public Viking equip(String buckler) {

        return this;
    }
}
