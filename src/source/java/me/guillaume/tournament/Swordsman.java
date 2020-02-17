package me.guillaume.tournament;

public class Swordsman {
    public int hitPoints;

    public Swordsman(){

    }

    public Swordsman(String str){

    }

    public void engage(Viking viking){
        System.out.println("sa compile");
    }

    public void engage(Highlander highlander){
        System.out.println("sa compile");
    }

    public int hitPoints(){
        return this.hitPoints;
    }

    public Swordsman equip(String stuff){

        return null;
    }
}
