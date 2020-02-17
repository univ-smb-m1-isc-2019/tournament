package me.guillaume.tournament;

public class Viking {
    public int hitPoints;
    public String leftHand;
    public String armor;

    public int hitPoints() {
        return hitPoints;
    }

    public void equip(String gear) {
        this.leftHand = gear;
    }
}
