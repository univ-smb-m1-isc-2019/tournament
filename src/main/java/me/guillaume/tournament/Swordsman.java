package me.guillaume.tournament;

public class Swordsman extends Fighter {
    public Swordsman() {
        OneHandSword ohsw = new OneHandSword();
        arms.add(ohsw);
        setDmg(ohsw.getDmg());
    }

    public Swordsman(String state) {
        super(state);
    }

    public Swordsman equip(String portable) {
        super.equip(portable);
        return this;
    }
}
