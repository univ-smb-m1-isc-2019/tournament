package me.guillaume.tournament;

public class Swordsman {
    public int hitPoints;
    public String leftHand;
    public String rightHand;
    public String armor;
    public String classe;

    public Swordsman () {
        this.hitPoints =  100;
        this.rightHand = "Sword";
        this.leftHand = "empty";
        this.armor = "empty";
        this.classe = "empty";
    }

    public Swordsman (String classe) {
        this.hitPoints =  100;
        this.rightHand = "Sword";
        this.leftHand = "empty";
        this.armor = "empty";
        this.classe = classe;
    }

    public void engage(Viking viking) {
    }

    public void engage(Highlander highlander) {
    }

    public int hitPoints() {
        return hitPoints;
    }

    public Swordsman equip(String gear) {
        this.leftHand = gear;
        return this;
    }
}
