package me.guillaume.tournament;

public class Swordsman extends Fighter {

    public Swordsman(String vicious) {
        this();
    }

    public Swordsman() {
        super(new Sword(), 100);
    }

    public void engage(Fighter fighter) {
        new Fight(this, fighter).run();
    }

    public Swordsman equip(String equipment) {
        if ("buckler".equals(equipment)) {
            buckler = new Buckler();
        }
        return this;
    }

    public void engage(Highlander highlander) {

    }

}
