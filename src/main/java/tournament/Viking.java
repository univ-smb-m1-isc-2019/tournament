package tournament;

public class Viking extends Fighter {
    private static int DAMAGE = 6;
    private static int LIFE = 120;

    public Viking()
    {
        super(LIFE,DAMAGE);
    }

    public Viking(String s)
    {
        super(s);
    }

    public int hitPoints() {
        return super.hitPoints();
    }

    @Override
    public Viking equip(String axe) {
        return null;
    }

    @Override
    public void engage(Fighter fighter) {
        super.engage(fighter);
    }

}
