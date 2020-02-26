package me.guillaume.tournament;

import java.util.ArrayList;

public class Swordsman extends Warrior{

    public Swordsman() {
        super.healthPoints = 100;
        super.dmg = 5;
        super.typeWarrior = null;
        super.equipment = new ArrayList<String>();
    }

    public Swordsman(String vicious) {
        super();
    }

    public Swordsman equip(String obj) {
            this.equipment.add(obj);
        return this;
    }
}
