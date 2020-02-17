package me.arnaud.fighters;

import me.arnaud.equipments.defences.*;
import me.arnaud.equipments.weapons.OneHandAxe;

public class Viking extends FighterAbstract {
    public Viking() {
        super(new OneHandAxe(), 120);
    }

    public Viking equip(String equipment){
        if (equipment.equals("buckler")){
            this.buckler = new Buckler();
        }else if(equipment.equals("armor")){
            this.armor = new Armor();
            this.weapon.setDmg(-1);
            this.dmgReduction += 3;
        }
        return this;
    }
}
