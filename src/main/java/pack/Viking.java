package pack;

public class Viking {
    private final static int HEALTH_POINTS_BEGIN = 135;
    private final static int DEFAULT_DAMAGE_WEAPON = 6;
    private int hp;

    public Viking(){
        this.hp=HEALTH_POINTS_BEGIN;
    }

    public int hitPoints() {
        return this.hp;
    }

    public void equip(String buckler) {
    }


    public void engage (Swordsman swordsman){

    }


}
