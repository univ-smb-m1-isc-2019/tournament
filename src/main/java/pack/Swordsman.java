package pack;

public class Swordsman extends Warrior{
    private final static int HEALTH_POINTS_BEGIN = 100;
    private final static int DEFAULT_DAMAGE_WEAPON = 5;

    public Swordsman(){
        super(HEALTH_POINTS_BEGIN, DEFAULT_DAMAGE_WEAPON);
    }

    public Swordsman ( String stuff ){
        super ( HEALTH_POINTS_BEGIN, DEFAULT_DAMAGE_WEAPON, stuff);
    }

    public Swordsman equip ( String stuff ){
        return new Swordsman(stuff);
    }
}
