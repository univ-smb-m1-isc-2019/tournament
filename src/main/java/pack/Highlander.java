package pack;

public class Highlander extends Warrior{
    private final static int HEALTH_POINTS_BEGIN = 150;
    private final static int DEFAULT_DAMAGE_WEAPON = 12;

    public Highlander() {
        super(HEALTH_POINTS_BEGIN,DEFAULT_DAMAGE_WEAPON);
    }
}
