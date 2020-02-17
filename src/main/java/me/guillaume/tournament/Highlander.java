package me.guillaume.tournament;

public class Highlander extends Fighter {
    int hitPoints = super.hitPoints + 50;

    public Highlander() {
    }

    public Highlander(String type) {
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

}
