package com.nespresso.sofa.recruitement.tournament;

public class Highlander extends Person{

    public Highlander(){
        super();
        super.hit_points = 150;
        super.righthand = new Weapon("Great Sword", 12);
    }

    public Highlander(String name){
        super();
        super.name = name;
    }

    public Highlander equip(String buckler){
        return this;
    }
}
