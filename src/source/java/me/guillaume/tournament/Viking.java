package me.guillaume.tournament;

public class Viking extends Warrior{

    public Viking(){
        this.name = "Viking";
        this.hitPoints = 120;
        this.weapon = new Weapon("axe",6);

    }

    public Viking(String str){

    }



    public int hitPoints(){
        return this.hitPoints;
    }

    public Viking equip(String stuff){
        return null;
    }

}
