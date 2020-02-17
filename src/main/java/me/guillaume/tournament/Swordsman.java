package me.guillaume.tournament;

public class Swordsman {
    public int hitPoints;
    public String leftHand;
    public String armor;

    public void engage(Viking viking) {
    }

    public int hitPoints() {
        return hitPoints;
    }

    public void equip(String gear) {
        this.leftHand = gear;
    }
}
