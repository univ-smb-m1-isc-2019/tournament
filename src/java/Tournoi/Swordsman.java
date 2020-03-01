package Tournoi;

public class Swordsman extends Combattant{

    private static Arme épée = new Arme("épéé",5);

    public Swordsman(){
       super(100, Swordsman.épée);

    }

    public Swordsman(String spec) {
        super(150,spec,Swordsman.épée);
    }

    public void engage(Combattant Comb){
        super.combat(Comb);
    }


    public int hitPoints(){
        return super.getpLife();
    }

    public Swordsman equip(String buckler) {
        return (Swordsman) super.equip(buckler);
    }

    public Swordsman retier_equipement(String buckler) {
        return (Swordsman) super.retier_equipement(buckler);
    }

}
