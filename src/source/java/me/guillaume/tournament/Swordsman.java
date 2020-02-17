package me.guillaume.tournament;

public class Swordsman extends Warrior{


    public Swordsman(){
        this.name = "Swordsman";
        this.hitPoints = 100;
        this.def = 0;
        super.equip("sword");
    }

    public Swordsman(String str){

    }



    public int hitPoints(){
        return this.hitPoints;
    }


}
