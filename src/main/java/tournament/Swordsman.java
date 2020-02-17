package tournament;

public class Swordsman extends Fighter {
    private static int LIFE = 100;
    private static int DAMAGE = 5;

    public Swordsman()
    {
        super(LIFE,DAMAGE);
    }

    public Swordsman(String s)
    {
        super(s);
    }

    @Override
    public Swordsman equip(String axe) {
        return null;
    }

}
