package me.guillaume.tournament;

public class Swordsman extends Warrior{

    public Swordsman() {
        hitpoints = 100;
        this.equipment = new Equipment("hand sword",5);
    }
    public Swordsman equip(String equipment){
        if (equipment.equals("buckler")){
            this.buckler = true;
        }
        return this;
    }
}