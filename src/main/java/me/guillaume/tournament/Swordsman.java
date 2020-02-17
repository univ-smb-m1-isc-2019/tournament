package me.guillaume.tournament;

public class Swordsman extends Fighter {
    public Swordsman() {
        setHp(100);

        OneHandSword ohsw = new OneHandSword();
        arms.add(ohsw);
        setDmg(ohsw.getDmg());
    }

    // TODO A corriger.
    public Swordsman(String state) {
        super(state);
    }

    public Swordsman equip(String portable) {
        super.equip(portable);
        return this;
    }
}
