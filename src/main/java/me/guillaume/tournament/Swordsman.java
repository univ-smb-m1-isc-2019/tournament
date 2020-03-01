package me.guillaume.tournament;

import java.util.ArrayList;

public class Swordsman extends Warrior{

    public Swordsman() {
        super(100, "Swordsman");
        this.equipment = new ArrayList<>();
        equip("sword");
    }

    public Swordsman(String vicious) {
        super();
    }

    public Swordsman equip(String obj) {
            this.equipment.add(createdEquipmentItem(obj));
            equipping();
        return this;
    }
}
