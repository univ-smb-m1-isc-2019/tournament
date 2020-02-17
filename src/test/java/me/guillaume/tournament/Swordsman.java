package me.guillaume.tournament;

/**
 * A Swordsman has 100 hit points and use a 1 hand sword that does 5 dmg
 */

public class Swordsman {
    public int HP;

    // CONSTRUCTEUR
    public Swordsman(){
        this.HP = 100;
    }
    public Swordsman(String str){
        this.HP = 100;
    }

    public int hitPoints() {
        return  this.HP;
    }

    public void engage(Viking viking) {
    }
    public void engage(Highlander highlander) {
    }

    public Swordsman equip(String buckler) {
        return null;
    }
}
