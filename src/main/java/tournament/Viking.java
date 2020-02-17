package tournament;

public class Viking extends Fighter {
    private static int VIE = 120;

    public Viking()
    {
        super(VIE);
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

}
