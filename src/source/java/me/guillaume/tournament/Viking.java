package me.guillaume.tournament;

public class Viking extends Warrior{

    public Viking(){
        this.hitPoints = 120;
        this.weapon = new Weapon("axe",6);

    }

    public Viking(String str){

    }

    public void engage(Warrior warrior){
        System.out.println("sa compile");
    }

    public int hitPoints(){
        return this.hitPoints;
    }

    public Viking equip(String stuff){
        return null;
    }

}
