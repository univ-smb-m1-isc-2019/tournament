package tournament;

/**
 * an Highlander as 150 hit points and fight with a Great Sword
 */

public class Highlander extends Fighter {

    // CONSTRUCTEUR
    public Highlander(){
        this.HP = 150;
    }
    public Highlander(String str){
        this.HP = 150;
    }

    public Highlander equip(String buckler) {
        super.equipF(buckler);
        return this;
    }

}
