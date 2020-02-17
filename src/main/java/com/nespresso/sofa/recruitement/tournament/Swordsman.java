package com.nespresso.sofa.recruitement.tournament;

public class Swordsman extends Person {

    public Swordsman(){
        super();
        super.hit_points = 100;
        super.righthand = new Weapon("hand sword",5);
    }

    public Swordsman(String name){
        super();
        super.name = name;
    }

    public Swordsman equip(String buckler){
        return this;
    }
}
