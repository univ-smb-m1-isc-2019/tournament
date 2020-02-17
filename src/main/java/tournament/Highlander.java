package tournament;

public class Highlander extends Fighter{
    private static int VIE = 150;

    public Highlander()
    {
        super(VIE);

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

}
