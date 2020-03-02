package me.guillaume.tournament;

public class Viking extends Fighter {

    public Viking() {
        super(new Axe(), 120);
    }

    public Viking equip(String equipment) {
        if ("buckler".equals(equipment)) {
            buckler = new Buckler();
        }
        return this;
    }

}
