package me.guillaume.tournament;

public class Highlander extends Fighter {
    int hitPoints = super.hitPoints + 50;
    int damagePoints = super.damagePoints + 7;

    public Highlander() {
        super.hitPoints += 50;
        super.damagePoints += 7;
    }

    public Highlander(String type) {
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

}
