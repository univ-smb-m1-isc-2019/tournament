package me.arnaud.fighters;

import me.arnaud.equipments.defences.Armor;
import me.arnaud.equipments.defences.Buckler;
import me.arnaud.equipments.weapons.GreatSword;
import me.arnaud.equipments.weapons.WeaponAbstract;

public class Highlander extends FighterAbstract {
    public Highlander() {
        super(new GreatSword(), 150);
    }
    public Highlander equip(String equipment){
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
