package me.guillaume.tournament.equipement.weapon;

import me.guillaume.tournament.equipement.Equipment;

public class Weapon extends Equipment {

    private int power;

    /* The attack speed defines how many times the fighter can attack before being fatigued. An attackSpeed of :
     * - 0, the fighter can attack every turn.
     * - 1, the fighter can attack 1 time before being fatigued
     * - etc...
     */
    private int attackSpeed;

    public Weapon(int power, int attackSpeed){
        this.power = power;
        this.attackSpeed = attackSpeed;
    }

    public int getPower(){
        return power;
    }

    public int getAttackSpeed(){
        return attackSpeed;
    }
}
