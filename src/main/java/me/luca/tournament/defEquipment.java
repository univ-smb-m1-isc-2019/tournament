package me.luca.tournament;

public class defEquipment extends Equipment {
    public defEquipment(String name) {
        super(name);
    }

    @Override
    public int getDmg() {
        return 0;
    }
}
