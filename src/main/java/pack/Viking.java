package pack;

public class Viking extends Warrior{
    private final static int HEALTH_POINTS_BEGIN = 135;
    private final static int DEFAULT_DAMAGE_WEAPON = 6;

    public Viking(){
        super(HEALTH_POINTS_BEGIN,DEFAULT_DAMAGE_WEAPON);
    }

}
