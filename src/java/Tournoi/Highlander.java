package Tournoi;

public class Highlander extends Combattant {

    private static Arme épée_lourde = new Arme("épée_lourde",12);

    public Highlander() {
        super(150,Highlander.épée_lourde);
    }

    public Highlander(String spec) {
        super(150, spec,Highlander.épée_lourde);

    }

    public void engage(Combattant Comb){
        super.combat(Comb);
    }

    public Highlander equip(String buckler) {
        return (Highlander) super.equip(buckler);
    }

    public int hitPoints() {
        return super.getpLife();
    }
}
