package tournament;

public class Highlander extends Fighter{
    private static int LIFE = 150;
    private static String DEFAULTWEAPON = "great sword";

    public Highlander()
    {
        super(LIFE,DEFAULTWEAPON);
        setHandFree( 2 - getDefaultWeapon().getHandNeeded());
    }

    public Highlander(String s)
    {
        super(s);
    }

    public Highlander equip(String equipement) {
        return (Highlander) super.equip(equipement);
    }


}
