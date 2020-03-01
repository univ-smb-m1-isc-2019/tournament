package me.guillaume.tournament;

public class Highlander extends Peasant{
    public Highlander (){
        super();
        this.hitPoints = 150;
        this.attackPoints = 12;

    }
    public Highlander(String classe){
        new Highlander();
        this.classe = classe;
    }

}
