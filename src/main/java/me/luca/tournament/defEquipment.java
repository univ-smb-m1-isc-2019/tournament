package me.luca.tournament;

public class defEquipment extends Equipment {
    public defEquipment(String name, int i) {
        super(name);
        super.dura = i;
    }

    @Override
    public int getDmg() {
        return 0;
    }

    @Override
    public int getDura() {
        return super.dura;
    }
}
