package me.guillaume.tournament;

public class Viking extends Fighter {
    int hitPoints = super.hitPoints + 20;

    public Viking() {
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

    Viking equip(String item){
        return this;
    }

}
