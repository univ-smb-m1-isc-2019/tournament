package me.guillaume.tournament;

public class Highlander extends Warrior {


    public Highlander(){

    }

    public void engage(Warrior warrior){
        System.out.println("sa compile");
    }

    public Highlander(String str){

    }

    public int hitPoints(){
        return this.hitPoints;
    }

    public Highlander equip(String stuff){
        return null;
    }
}
