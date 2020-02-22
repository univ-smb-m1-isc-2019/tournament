package tournament;

/**
 * A Swordsman has 100 hit points and use a 1 hand sword that does 5 dmg
 */

public class Swordsman extends Fighter {


    // CONSTRUCTEUR
    public Swordsman(){
        super();
        this.HP = 100;
        this.weapon = new Weapon("sword",5,1);

    }
    public Swordsman(String str){
        super();
        this.HP = 100;
        this.powerFighter(str);
        this.name = str;
        this.weapon = new Weapon("sword",5,1);
    }

    public Swordsman equip(String equip) {
        super.equipF(equip);
        return this;
    }





}
