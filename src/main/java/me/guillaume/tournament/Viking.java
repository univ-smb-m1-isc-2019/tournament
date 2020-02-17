package me.guillaume.tournament;

public class Viking extends Fighter {
    public Viking() {
        OneHandAxe ohax = new OneHandAxe();
        arms.add(ohax);
        setDmg(ohax.getDmg());
    }

    public Viking(String state) {
        super(state);
    }

    public Viking equip(String portable) {
        super.equip(portable);
        return this;
    }
}
