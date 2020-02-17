package me.guillaume.tournament;

public class Viking extends Fighter{

    private final static int HIT_POINTS = 120;


    public Viking(){
        super(HIT_POINTS, new OneHandAxe());
    }

    public Viking(String type){
        super(HIT_POINTS, new OneHandAxe());

    }

    public Viking equip(String equipment){

        return this;
    }

}
