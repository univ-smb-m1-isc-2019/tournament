package tournament;

/**
 * A Viking has 120 hit points and use a 1 hand axe that does 6 dmg
 */

public class Viking extends Fighter {

    // CONSTRUCTEUR
    public Viking(){
        this.HP = 120;
    }

    public Viking equip(String buckler) {
        super.equipF(buckler);
        return this;
    }

}
