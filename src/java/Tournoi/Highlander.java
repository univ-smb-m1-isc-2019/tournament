package Tournoi;

public class Highlander extends Combattant {

    private static Arme épée_lourde = new Arme("épée_lourde",6);

    public Highlander() {
        super(150,Highlander.épée_lourde);
    }

    public Highlander(String veteran) {
        super(150, veteran);

    }

    public int hitPoints() {
        return super.getpLife();
    }
}
