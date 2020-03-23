package me.guillaume.tournament;

public class Viking extends Peasant{
    public Viking (){
        super();
        this.hitPoints = 120;
        this.attackPoints = 6;

    }
    public Viking(String classe){
        this.classe = classe;
    }

    public Viking equip(String gear){
            this.leftHand = gear;
        return this;
    }

}
