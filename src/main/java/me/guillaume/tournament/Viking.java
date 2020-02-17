package me.guillaume.tournament;

public class Viking {
    public int hitPoints;
    public String leftHand;
    public String rightHand;
    public String armor;
    public String classe;

    public Viking () {
        this.hitPoints =  120;
        this.rightHand = "Axe";
        this.leftHand = "empty";
        this.armor = "empty";
        this.classe = "empty";
    }

    public int hitPoints() {
        return hitPoints;
    }

    public Viking equip(String gear) {
        this.leftHand = gear;
        return this;
    }
}
