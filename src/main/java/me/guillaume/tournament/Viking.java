package me.guillaume.tournament;

public class Viking extends Fighter {

    public Viking() {
        super.hitPoints += 20;
        super.damagePoints += 1;
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

    Viking equip(String item){
        return this;
    }

}
