package pack;

public class Highlander extends Warrior{
    private final static int HEALTH_POINTS_BEGIN = 150;
    private final static Weapon DEFAULT_WEAPON = new Weapon ("Greatsword");

    public Highlander() {
        super(HEALTH_POINTS_BEGIN,DEFAULT_WEAPON);
    }

    public Highlander(String type) {
        super(HEALTH_POINTS_BEGIN,DEFAULT_WEAPON);
    }
}
