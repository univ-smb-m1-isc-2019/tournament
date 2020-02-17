package com.nespresso.sofa.recruitement.tournament;

public class Viking extends Person{

    public Viking(){
        super();
        super.hit_points = 120;
        super.righthand = new Weapon("hand axe", 6);
    }

    public Viking equip(String buckler){
        return this;
    }
}
