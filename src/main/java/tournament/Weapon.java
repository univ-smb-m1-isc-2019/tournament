package tournament;

public class Weapon {
    public String name;
    public int dmg;
    public int nbHand;

    public Weapon( String name, int dmg, int nbHand){
        this.name = name;
        this.dmg = dmg;
        this.nbHand = nbHand;

    }
    public int getDmg(){
        return this.dmg;
    }

    public int getNbHand(){
        return this.nbHand;
    }
}
