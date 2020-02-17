package Tournoi;

public class Swordsman extends Combattant{

    private static Arme épée = new Arme("épéé",5);

    public Swordsman(){
       super(100, Swordsman.épée);

    }

    public Swordsman(String vicious) {
        super(150,vicious);
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

    public Swordsman unequip(String buckler) {
        return (Swordsman) super.unequip(buckler);
    }

}
