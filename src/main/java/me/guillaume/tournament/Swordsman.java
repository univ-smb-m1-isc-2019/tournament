package me.guillaume.tournament;

public class Swordsman extends Fighter{

    private final static int HIT_POINTS = 100;

    public Swordsman(){
        super(HIT_POINTS);

    }

    public Swordsman(String type){
        super(HIT_POINTS);

    }

    public Swordsman equip(String equipment){

        return this;
    }
}
