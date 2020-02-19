package pack;

public class Swordsman extends Warrior{
    private final static int HEALTH_POINTS_BEGIN = 100;
    private final static Weapon DEFAULT_WEAPON = new Weapon ("Sword");

    public Swordsman(){
        super(HEALTH_POINTS_BEGIN,DEFAULT_WEAPON);
    }

    public Swordsman(String type) {
        super(HEALTH_POINTS_BEGIN,DEFAULT_WEAPON);
    }

    public Swordsman equip ( String stuff ){
        return (Swordsman)super.equip(stuff);
    }
}
