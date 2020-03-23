package me.guillaume.tournament;

abstract public class Peasant {
    public int hitPoints;
    public String leftHand;
    public String rightHand;
    public String armor;
    public String classe;
    public int attackPoints;

    public int hitPoints() {
        return hitPoints;
    }

    public String getLeftHand() {
        return leftHand;
    }

    public String getRightHand() {
        return rightHand;
    }

    public String getArmor() {
        return armor;
    }

    public String getClasse() {
        return classe;
    }

    public Peasant(){
        this.hitPoints =  1;
        this.rightHand = "Sword";
        this.leftHand = "empty";
        this.armor = "empty";
        this.classe = "empty";
        this.attackPoints = 1;
    }


    public void engage(Peasant p) {

    }

    public Peasant equip(String gear) {
        this.leftHand = gear;
        return this;
    }

    public void manageHP(){
        if (this.hitPoints < 0){
            this.hitPoints = 0;
        }
    }

}
