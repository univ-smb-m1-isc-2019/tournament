package me.guillaume.tournament;

public class Weapon extends Equipment{

    private int power;
    private int handlingType;

    public Weapon(int power, int handlingType){
        this.power = power;
        this.handlingType = handlingType;
    }

    public int getPower(){
        return power;
    }

}
