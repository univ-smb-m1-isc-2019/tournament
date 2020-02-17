package me.arnaud.fighters;

import me.arnaud.equipments.defences.*;
import me.arnaud.equipments.weapons.*;

import java.util.ArrayList;

public abstract class FighterAbstract {
    protected WeaponAbstract weapon;
    protected Buckler buckler = null;
    protected Armor armor = null;
    protected int dmgReduction;
    private int hit_points;
    private boolean canAtq;
    FighterAbstract(WeaponAbstract weapon, int hit_points){
        this.weapon = weapon;
        this.hit_points = hit_points;
        this.canAtq = true;
        this.dmgReduction = 0;
    }

    public void engage(FighterAbstract opponent) {

        if (opponent.isAlive()){
            this.weapon.atq();
            if (this.weapon.canDmg()){
                opponent.receiveDmg(this.weapon);
            }
            if (opponent.canEngage())
                opponent.engage(this);
        }
    }
    public boolean canEngage(){
        return isAlive() && canAtq;
    }
    private boolean isAlive(){
        return hit_points > 0;
    }
    private void receiveDmg(WeaponAbstract weapon){
        if (this.buckler != null){
            getDmgWithBuckler(weapon);
        }else {
            getDmg(weapon.dmg());
        }
    }
    private void getDmg(int dmg){
        dmg -= dmgReduction;
        this.hit_points -= dmg;
        this.hit_points = Math.max(this.hit_points, 0);
    }
    private void getDmgWithBuckler(WeaponAbstract weapon){
        if (this.buckler.destroyed()){
            getDmg(weapon.dmg());
        }else if(this.buckler.canBlock()){
            if(weapon instanceof OneHandAxe)
                this.buckler.axeBlock();
            this.buckler.blockState();
        }else {
            getDmg(weapon.dmg());
            this.buckler.blockState();
        }
    }
    public int hitPoints() {
        return this.hit_points;
    }
}
