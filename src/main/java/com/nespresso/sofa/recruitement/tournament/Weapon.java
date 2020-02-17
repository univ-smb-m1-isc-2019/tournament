package com.nespresso.sofa.recruitement.tournament;

public class Weapon {

    private String name;
    private int damage;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public Weapon(int damage){
        this.damage = damage;
    }

    public Weapon(){

    }

    public String getName(){
        return name;
    }

    public int getDamage(){
        return damage;
    }
}
