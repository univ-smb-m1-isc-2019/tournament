package me.guillaume.tournament;

import java.util.ArrayList;

public class Highlander extends Warrior{

    public Highlander() {
        super(150, "Highlander");
        this.equipment = new ArrayList<>();
        equip("Great Sword");
    }

    public Highlander equip(String obj) {
            this.equipment.add(createdEquipmentItem(obj));
            equipping();
        return this;
    }

    public Highlander(String veteran) {
        super();
    }
}
