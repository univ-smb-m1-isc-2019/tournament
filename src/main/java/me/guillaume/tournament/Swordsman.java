package me.guillaume.tournament;

public class Swordsman extends Fighter {
    private int hitPoints=100;
    private String equipement;

    public Swordsman() {

    }

    public Swordsman(String type) {
       super(type);
    }

    public void engage(Viking viking) {
    }

    public void engage(Highlander viking) {
    }
    public Swordsman equip(String buckler) {
        Swordsman swordsman=new Swordsman();
        return swordsman;
    }
}
