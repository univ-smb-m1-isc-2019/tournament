package me.arnaud.equipments.weapons;

import me.arnaud.equipments.EquipmentAbstract;

public abstract class WeaponAbstract extends EquipmentAbstract {
    private int dmg;
    public WeaponAbstract(int dmg){
        this.dmg = dmg;
    }
    public int dmg(){
        return this.dmg;
    }
}
