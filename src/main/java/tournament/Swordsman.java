package tournament;

public class Swordsman extends Fighter {

    public Swordsman()
    {
        super();
    }

    public Swordsman(String s)
    {
        super(s);
    }

    @Override
    public int hitPoints() {
        return 0;
    }

    @Override
    public Swordsman equip(String axe) {
        return null;
    }
}
