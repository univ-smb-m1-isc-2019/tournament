package pack;

public class Swordsman {
    private final static int HEALTH_POINTS_BEGIN = 100;
    private final static int DEFAULT_DAMAGE_WEAPON = 5;
    private int hp;

    public Swordsman(){
        this.hp=HEALTH_POINTS_BEGIN;
    }

    public int hitPoints() {
        return 0;
    }

    public void equip(String buckler) {
    }


    public void engage(Viking viking) {
        while ((this.hp > 0) && (viking.hitPoints() > 0)){

        }
    }
}
