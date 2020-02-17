package tournament;

public class Highlander extends Fighter{

    public Highlander()
    {
        super(150);
    }

    public Highlander(String s)
    {
        super(s);
    }

    @Override
    public int hitPoints() {
        return 0;
    }

    @Override
    public Highlander equip(String axe) {
        return null;
    }

}
