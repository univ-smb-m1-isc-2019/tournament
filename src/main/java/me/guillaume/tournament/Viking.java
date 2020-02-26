package me.guillaume.tournament;

import java.util.ArrayList;

public class Viking extends Warrior{

    public Viking(){
        super.healthPoints = 120;
        super.dmg = 6;
        super.typeWarrior = null;
        super.equipment = new ArrayList<String>();
    }

    public Viking equip(String obj) {
            this.equipment.add(obj);
        return this;
    }
}
