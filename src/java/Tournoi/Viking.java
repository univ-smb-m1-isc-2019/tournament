package Tournoi;

public class Viking extends Combattant{

    private static Arme hache = new Arme("hache",6);


    public Viking(){
        super(120,Viking.hache);
    }

    public void engage(Combattant Comb){
        super.combat(Comb);
    }

    public int hitPoints(){
        return super.getpLife();
    }

    public Viking equip(String buckler) {
        return (Viking) super.equip(buckler);
    }

}
