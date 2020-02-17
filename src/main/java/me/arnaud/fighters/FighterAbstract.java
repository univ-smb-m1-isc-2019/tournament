package me.arnaud.fighters;

import me.arnaud.weapons.WeaponAbstract;

public abstract class FighterAbstract {
    private WeaponAbstract weapon;
    private int hit_points;
    FighterAbstract(WeaponAbstract weapon){
        this.weapon = weapon;
    }
}
