package me.guillaume.tournament;

public class Viking extends Fighter {
    public Viking() {
    }

    public Viking(String state) {
        super(state);
    }

    public Viking equip(String portable) {
        super.equip(portable);
        return this;
    }
}
