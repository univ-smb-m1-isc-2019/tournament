package me.arnaud.fighters;

import me.arnaud.equipments.EquipmentAbstract;
import me.arnaud.equipments.defences.*;
import me.arnaud.equipments.weapons.*;

import java.util.ArrayList;

public abstract class FighterAbstract {
    protected ArrayList<EquipmentAbstract> equipments;
    private WeaponAbstract weapon;
    private int hit_points;
    FighterAbstract(WeaponAbstract weapon, int hit_points){
        this.weapon = weapon;
        this.hit_points = hit_points;
        this.equipments = new ArrayList<>();
    }

    public void engage(FighterAbstract opponent) {
        if (opponent.isAlive()){
            opponent.receiveDmg(this.weapon.dmg());
            if (opponent.isAlive())
                opponent.engage(this);
        }
    }

    public boolean isAlive(){
        return hit_points > 0;
    }
    public void receiveDmg(int dmg){
        this.hit_points -= dmg;
        this.hit_points = Math.max(this.hit_points, 0);
    }
    public int hitPoints() {
        return this.hit_points;
    }
}
