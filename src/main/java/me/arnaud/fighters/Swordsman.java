package me.arnaud.fighters;

import me.arnaud.equipments.EquipmentAbstract;
import me.arnaud.equipments.weapons.OneHandSword;

import me.arnaud.equipments.defences.*;
import java.util.ArrayList;

public class Swordsman extends FighterAbstract {
    public Swordsman() {
        super(new OneHandSword(), 100);
        this.equipments = new ArrayList<>();
    }

    public Swordsman equip(String equipment){
        if (equipment == "buckler"){
            this.equipments.add(new Buckler());
        }
        return this;
    }
}
