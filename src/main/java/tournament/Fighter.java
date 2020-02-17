package tournament;

public abstract class Fighter {

    private int hitPoints;
    private int damage;

    protected Fighter(int hitPoints,int damage)
    {
        setHitPoints(hitPoints);
        setDamage(damage);

    }


    protected Fighter(String elt)
    {

    }

    protected void engage(Fighter fighter)
    {

        while (this.isNotDead() && fighter.isNotDead())
        {
            fighter.isAttackedBy(this);
            this.isAttackedBy(fighter);
        }

    }

    private void isAttackedBy(Fighter fighter)
    {
        setHitPoints(getHitPoints() - fighter.getDamage());

    }

    protected int hitPoints()
    {
        return getHitPoints();
    }

    public abstract Fighter equip(String axe);

    public boolean isNotDead()
    {
        return getHitPoints() != 0;
    }



    protected void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }
    protected int getHitPoints()
    {
        return this.hitPoints;
    }
    protected void setDamage(int damage){this.damage = damage;}
    protected  int getDamage(){return this.damage;}



}
