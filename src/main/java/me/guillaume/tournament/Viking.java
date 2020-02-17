package me.guillaume.tournament;

public class Viking extends Fighter {
    private int hitPoints=120;

    public Viking(){}

    public Viking(String type){
        super(type);
    }
    public Viking equip(String buckler) {
        Viking viking=new Viking();
        return viking;
    }

}
