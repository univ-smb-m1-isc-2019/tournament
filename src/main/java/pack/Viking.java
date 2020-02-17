package pack;

public class Viking extends Warrior{
    private final static int HEALTH_POINTS_BEGIN = 120;
    private final static Weapon DEFAULT_WEAPON = new Weapon ("Axe");

    public Viking(){
        super(HEALTH_POINTS_BEGIN,DEFAULT_WEAPON);
    }

    public Viking(String stuff) {
        super ( HEALTH_POINTS_BEGIN,DEFAULT_WEAPON, stuff);
    }

    public Viking equip ( String stuff ){
        return new Viking(stuff);
    }

}
