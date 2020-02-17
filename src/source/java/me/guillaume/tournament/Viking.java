package me.guillaume.tournament;

public class Viking extends Warrior{

    public Viking(){
        this.name = "Viking";
        this.hitPoints = 120;
        this.defencePoints = 0;
        super.equip("axe");
    }

    public Viking(String str){

    }



    public int hitPoints(){
        return this.hitPoints;
    }



}
