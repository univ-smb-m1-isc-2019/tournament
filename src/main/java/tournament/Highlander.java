package tournament;

public class Highlander extends Fighter{
    private static int LIFE = 150;
    private static int DAMAGE = 12;

    public Highlander()
    {
        super(LIFE,DAMAGE);

    }

    public Highlander(String s)
    {
        super(s);
    }

    public int hitPoints() {
        return super.hitPoints();
    }

    @Override
    public Highlander equip(String axe) {
        return null;
    }

    @Override
    public void engage(Fighter fighter) {
        super.engage(fighter);
    }

}
