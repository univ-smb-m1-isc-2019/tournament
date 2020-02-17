package me.guillaume.tournament;

public class Highlander {
    public int hitPoints;
    public String leftHand;
    public String rightHand;
    public String armor;
    public String classe;

    public Highlander () {
        this.hitPoints =  150;
        this.rightHand = "Great Sword";
        this.leftHand = "empty";
        this.armor = "High armor";
        this.classe = "empty";
    }

    public Highlander (String classe) {
        this.hitPoints =  150;
        this.rightHand = "Great Sword";
        this.leftHand = "empty";
        this.armor = "High armor";
        this.classe = classe;
    }

    public int hitPoints() {
        return hitPoints;
    }
}
