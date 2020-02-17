package me.guillaume.tournament;

public class Weapon {

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
