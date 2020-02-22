package tournament;

/**
 * A Viking has 120 hit points and use a 1 hand axe that does 6 dmg
 */

public class Viking extends Fighter {

    // CONSTRUCTEUR
    public Viking(){
        super();
        this.HP = 120;
        this.weapon = new Weapon("axe",6,1);
    }

    public Viking equip(String equip) {
        super.equipF(equip);
        return this;
    }

}
