package me.guillaume.tournament;

import java.util.ArrayList;
import java.util.List;

public class Warrior {
    int hitpoints;
    Equipment equipment;
    boolean buckler;

    public int hitPoints() {
        return hitpoints;
    }

    public void engage(Warrior wr){
        while(this.hitPoints() > 0 && wr.hitPoints() > 0){
            if (wr.hitpoints< this.equipment.damage){
                wr.hitpoints = 0;
            }else {
                wr.hitpoints -= this.equipment.damage;
            }
            if (this.hitpoints < wr.equipment.damage) {
                this.hitpoints = 0;
            }else{
                this.hitpoints -= wr.equipment.damage;
            }
        }

    }

}
