package me.arnaud.equipments.defences;

public class Buckler {
    private int axeBlockTime;
    private boolean canBlock;
    private boolean destroyed;
    public Buckler(){
        this.axeBlockTime = 3;
        this.destroyed = false;
        this.canBlock = true;
    }
    public void axeBlock(){
        this.axeBlockTime--;
        if (this.axeBlockTime <= 0)
            destroyed = true;
    }
    public void blockState(){
        this.canBlock = !this.canBlock;
    }
    public boolean canBlock(){
        return this.canBlock;
    }
    public boolean destroyed(){
        return this.destroyed;
    }
}
