package me.guillaume.tournament;

public class Swordsman extends Fighter {
    int hitPoints = super.hitPoints;
    int damagePoints = super.damagePoints;

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

    void engage(Viking viking){
    }

    void engage(Highlander highlander){
    }




}
