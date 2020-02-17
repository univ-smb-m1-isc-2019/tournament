package tournament;

public class Swordsman extends Fighter {
    private static int LIFE = 100;
    private static int HANDFREE ;
    private static String DEFAULTWEAPON = "sword";

    public Swordsman()
    {
        super(LIFE,DEFAULTWEAPON);
        setHandFree( 2 - getDefaultWeapon().getHandNeeded());
    }

    public Swordsman(String s)
    {
        super(s);
    }

    public Swordsman equip(String equipement) {
        return (Swordsman)super.equip(equipement);
    }

}
