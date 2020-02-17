package me.guillaume.tournament;

public class Weapon {
    public String name;
    public int damage;
    public int greatSwordCount;
    public boolean isGreatSword;


    public Weapon(String name,int damage) {
        if (name.equals("great sword")){
            isGreatSword = true;

        }
        else{
            isGreatSword = false;
        }
        this.name = name;
        this.damage = damage;
        this.greatSwordCount = 0;
    }
}


