package me.guillaume.tournament;

/**
 * A Viking has 120 hit points and use a 1 hand axe that does 6 dmg
 */

public class Viking {
    public int HP;

    // CONSTRUCTEUR
    public Viking(){
        this.HP = 120;
    }

    public int hitPoints() {
        return  this.HP;
    }

    public Viking equip(String buckler) {
        return null;
    }
}
