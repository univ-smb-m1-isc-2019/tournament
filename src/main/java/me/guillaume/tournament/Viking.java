package me.guillaume.tournament;

public class Viking extends Warrior{

    public Viking() {
        this.hitpoints = 120;
        this.equipment = new Equipment("hand axe",6);
    }

    public Viking equip(String equipment) {
        if (equipment.equals("buckler")){
            this.buckler = true;
        }
        return this;
    }
}