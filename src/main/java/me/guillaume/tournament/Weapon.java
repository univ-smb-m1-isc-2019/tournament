package me.guillaume.tournament;

public class Weapon extends Equipment{

    private int power;
    private int attackSpeed;
    private int handlingType;

    public Weapon(int power, int attackSpeed, int handlingType){
        this.power = power;
        this.attackSpeed = attackSpeed;
        this.handlingType = handlingType;
    }

    public int getPower(){
        return power;
    }

    public int getAttackSpeed(){
        return attackSpeed;
    }

}
