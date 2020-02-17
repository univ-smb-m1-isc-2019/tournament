package me.arnaud.fighters;

import me.arnaud.weapons.WeaponAbstract;

public abstract class FighterAbstract {
    private WeaponAbstract weapon;
    private int hit_points;
    FighterAbstract(WeaponAbstract weapon, int hit_points){
        this.weapon = weapon;
        this.hit_points = hit_points;
    }
}
