package me.guillaume.tournament;

public class Swordsman extends Fighter {

    public Swordsman() {
    }

    public Swordsman(String type) {
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

    Swordsman equip(String item){
        return this;
    }

}
