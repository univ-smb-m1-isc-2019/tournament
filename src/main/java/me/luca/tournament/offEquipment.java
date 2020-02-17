package me.luca.tournament;

public class offEquipment extends Equipment {

    public offEquipment(String name, int dmg) {
        super(name,dmg);
    }

    public int getDmg() {
        return super.dmg;
    }

    @Override
    public int getDura() {
        return 0;
    }

}
