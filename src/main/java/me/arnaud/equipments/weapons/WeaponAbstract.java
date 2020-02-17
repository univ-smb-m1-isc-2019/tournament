package me.arnaud.equipments.weapons;

public abstract class WeaponAbstract {
    private int dmg;
    public WeaponAbstract(int dmg){
        this.dmg = dmg;
    }
    public int dmg(){
        return this.dmg;
    }
}
