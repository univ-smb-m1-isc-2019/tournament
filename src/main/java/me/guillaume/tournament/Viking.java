package me.guillaume.tournament;

public class Viking extends Warrior{

    public Viking(){
        super.hitPoints = 120;
        super.dmg = 6;
        super.typeWarrior = null;
        super.equipment = null;
    }

    public Viking equip(String buckler) {
        return null;
    }
}
