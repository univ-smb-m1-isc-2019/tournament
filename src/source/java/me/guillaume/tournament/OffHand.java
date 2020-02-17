package me.guillaume.tournament;

public class OffHand {
    String name;
    int axeCount;
    int block;
    boolean destroyed;

    public OffHand(String name){
        this.block = 0;
        this.axeCount = 0;
        this.name = name;
        this.destroyed = false;
    }
}
