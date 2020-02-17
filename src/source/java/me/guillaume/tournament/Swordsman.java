package me.guillaume.tournament;

public class Swordsman extends Warrior{


    public Swordsman(){
        this.hitPoints = 100;
        this.weapon = new Weapon("sword",5);
    }

    public Swordsman(String str){

    }

    public void engage(Warrior warrior){
        System.out.println("sa compile");
    }

    public int hitPoints(){
        return this.hitPoints;
    }

    public Swordsman equip(String stuff){

        return null;
    }
}
