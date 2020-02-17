package me.guillaume.tournament;

public class Weapon {
    public String name;
    public int damage;
    public boolean isShield;

    public Weapon(String name,int damage){
        this.name = name;
        this.damage = damage;
        this.isShield = false;
    }
    public Weapon(String name,boolean isShield){
        this.name = name;
        this.damage = 0;
        this.isShield = true;
    }
}
