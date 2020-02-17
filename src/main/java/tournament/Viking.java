package tournament;

public class Viking extends Fighter {

    public Viking()
    {
        super(120);
    }

    public Viking(String s)
    {
        super(s);
    }

    @Override
    public int hitPoints() {
        return 0;
    }

    @Override
    public Viking equip(String axe) {
        return null;
    }

}
