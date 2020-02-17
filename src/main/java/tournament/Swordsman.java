package tournament;

/**
 * A Swordsman has 100 hit points and use a 1 hand sword that does 5 dmg
 */

public class Swordsman extends Fighter {


    // CONSTRUCTEUR
    public Swordsman(){
        this.HP = 100;

    }
    public Swordsman(String str){
        this.HP = 100;
    }

    public Swordsman equip(String buckler) {
        super.equipF(buckler);
        return this;
    }


    public void engage(Viking viking) {

        while(!this.isDead() && !viking.isDead()){
            this.HP = this.HP - 6;
            viking.HP = viking.HP - 5;
        }



    }

    public void engage(Highlander highlander) {
    }

}
