package me.arnaud.fighters;

import me.arnaud.equipments.weapons.OneHandSword;

import me.arnaud.equipments.defences.*;
import java.util.ArrayList;

public class Swordsman extends FighterAbstract {
    public Swordsman() {
        super(new OneHandSword(), 100);
    }

    public Swordsman equip(String equipment){
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
