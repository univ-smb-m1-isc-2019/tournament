package me.guillaume.tournament;

public class Highlander extends Fighter{

    private final static int HIT_POINTS = 150;


    public Highlander(){
        super(HIT_POINTS);
    }

    public Highlander(String type){
        super(HIT_POINTS);

    }

    public Highlander equip(String equipment){
        return this;
    }
}
