package tournament;

public class Viking extends Fighter {

    private static int LIFE = 120;
    private static String DEFAULTWEAPON = "axe";

    public Viking()
    {
        super(LIFE,DEFAULTWEAPON);
        setHandFree( 2 - getDefaultWeapon().getHandNeeded());
    }

    public int hitPoints() {
        return super.hitPoints();
    }

    public Viking equip(String equipement) {
        return (Viking) super.equip(equipement);
    }


}
