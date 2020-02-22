package tournament;

/**
 * an Highlander as 150 hit points and fight with a Great Sword
 */

public class Highlander extends Fighter {

    // CONSTRUCTEUR
    public Highlander(){
        super();
        this.HP = 150;
        this.weapon = new Weapon("Great Sword",12,2);
    }
    public Highlander(String str){
        super();
        this.HP = 150;
        this.powerFighter(str);
        this.name = str;
        this.weapon = new Weapon("Great Sword",12,2);
    }

    public Highlander equip(String equip) {
        super.equipF(equip);
        return this;
    }

}
