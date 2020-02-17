package tournament;

public abstract class Fighter {

    private int hitPoints;

    protected Fighter(int hitPoints)
    {
        setHitPoints(hitPoints);

    }

    protected void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }
    protected int getHitPoints()
    {
        return this.hitPoints;
    }

    protected Fighter(String elt)
    {

    }

    protected void engage(Fighter fighter)
    {

    }

    protected int hitPoints()
    {
        return getHitPoints();
    }

    public abstract Fighter equip(String axe);
}
