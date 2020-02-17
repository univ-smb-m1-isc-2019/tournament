package tournament;

public class Swordsman extends Fighter {
    private static int VIE = 100;

    public Swordsman()
    {
        super(VIE);
    }

    public Swordsman(String s)
    {
        super(s);
    }

    public int hitPoints() {
        return super.hitPoints();
    }

    @Override
    public Swordsman equip(String axe) {
        return null;
    }
}
