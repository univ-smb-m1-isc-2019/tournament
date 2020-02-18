package tournament;

public class Swordsman extends Fighter {
    private static int LIFE = 100;
    private static String DEFAULTWEAPON = "sword";
    private int poisonHit;

    public Swordsman()
    {
        super(LIFE,DEFAULTWEAPON);
        setHandFree( 2 - getDefaultWeapon().getHandNeeded());
        setPoisonHit(0);
    }

    public Swordsman(String behaviour)
    {
        super(LIFE,DEFAULTWEAPON,behaviour);
        setHandFree( 2 - getDefaultWeapon().getHandNeeded());
        if(behaviour.equals("Vicious"))
        {
            setPoisonHit(2);
        }
    }

    public Swordsman equip(String equipement) {
        return (Swordsman)super.equip(equipement);
    }

    public int getPoisonHit() {
        return poisonHit;
    }

    public void setPoisonHit(int poisonHit) {
        this.poisonHit = poisonHit;
    }

    @Override
    public int addBehaviourDamages()
    {
        if(getBehaviour().equals("Vicious") && getPoisonHit()>0)
        {
            setPoisonHit(getPoisonHit() - 1);
            return 20;
        }
        else
        {
            return 0;
        }

    }
}
