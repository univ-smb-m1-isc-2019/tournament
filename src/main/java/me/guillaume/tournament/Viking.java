package me.guillaume.tournament;

import java.util.ArrayList;

public class Viking extends Warrior{

    public Viking(){
        super(120, "Viking");
        this.equipment = new ArrayList<>();
        equip("axe");
    }

    public Viking equip(String obj) {
            this.equipment.add(createdEquipmentItem(obj));
            equipping();
        return this;
    }
}
