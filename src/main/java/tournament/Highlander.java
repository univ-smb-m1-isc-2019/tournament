package tournament;

public class Highlander extends Fighter{
    private static int LIFE = 150;
    private static String DEFAULTWEAPON = "great sword";
    private int startBerserk;



    public Highlander()
    {
        super(LIFE,DEFAULTWEAPON);
        setHandFree( 2 - getDefaultWeapon().getHandNeeded());
        setStartBerserk(0);
    }

    public Highlander(String behaviour)
    {
        super(LIFE,DEFAULTWEAPON,behaviour);
        setHandFree( 2 - getDefaultWeapon().getHandNeeded());
        setStartBerserk(30);
    }

    @Override
    public int addBehaviourDamages() {
        if(getHitPoints() < (LIFE *getStartBerserk())/100)
        {
            return getDefaultWeapon().getDamage();
        }
        else
        {
            return 0;
        }

    }

    public Highlander equip(String equipement) {
        return (Highlander) super.equip(equipement);
    }

    public int getStartBerserk() {
        return startBerserk;
    }

    public void setStartBerserk(int startBerserk) {
        this.startBerserk = startBerserk;
    }

}
