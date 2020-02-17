package tournament;

public abstract class Fighter {

    private int hitPoints;

    public Fighter(int hitPoints)
    {
        setHitPoints(hitPoints);

    }

    private void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }
    public int getHitPoints()
    {
        return this.hitPoints;
    }

    public Fighter(String elt)
    {

    }

    public void engage(Fighter fighter)
    {

    }

    public abstract int hitPoints();

    public abstract Fighter equip(String axe);
}
