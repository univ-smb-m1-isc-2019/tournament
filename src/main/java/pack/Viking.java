package pack;

public class Viking extends Warrior{
    private final static int HEALTH_POINTS_BEGIN = 120;
    private final static int DEFAULT_DAMAGE_WEAPON = 6;
    private static WeaponKind DEFAULT_WEAPON_KIND;

    public Viking(){
        super(HEALTH_POINTS_BEGIN,DEFAULT_DAMAGE_WEAPON);
    }

    public Viking equip ( String stuff ){
        return new Viking();
    }

}