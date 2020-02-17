package me.guillaume.tournament;

public class Swordsman extends Warrior{

    public Swordsman() {
        super.hitPoints = 100;
        super.dmg = 5;
        super.typeWarrior = null;
        super.equipment = null;
    }

    public Swordsman(String vicious) {
        super();
    }

    public Swordsman equip(String buckler) {
        return null;
    }
}
