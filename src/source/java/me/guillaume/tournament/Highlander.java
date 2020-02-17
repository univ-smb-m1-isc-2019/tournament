package me.guillaume.tournament;

public class Highlander extends Warrior {


    public Highlander(){
        this.name = "Highlander";
        this.hitPoints = 150;
        super.equip("great sword");
        this.defencePoints = 0;
    }



    public Highlander(String str){

    }

    public int hitPoints(){
        return this.hitPoints;
    }


}
