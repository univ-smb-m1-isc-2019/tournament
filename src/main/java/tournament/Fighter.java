package tournament;

public abstract class Fighter {

    private int hitPoints;
    private int damage;

    public Fighter(int hitPoints,int damage)
    {
        setHitPoints(hitPoints);
        setDamage(damage);

    }


    public Fighter(String elt)
    {

    }

    public void engage(Fighter fighter)
    {

        while (this.isNotDead() && fighter.isNotDead())
        {
            fighter.isAttackedBy(this);
            this.isAttackedBy(fighter);
        }

    }

    private void isAttackedBy(Fighter fighter)
    {
        int nextLife = getHitPoints() - fighter.getDamage();
        setHitPoints(Math.max(nextLife, 0));
    }

    public int hitPoints()
    {
        return getHitPoints();
    }

    public abstract Fighter equip(String axe);

    public boolean isNotDead()
    {
        return getHitPoints() > 0;
    }



    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }
    public int getHitPoints()
    {
        return this.hitPoints;
    }
    public void setDamage(int damage){this.damage = damage;}
    public  int getDamage(){return this.damage;}



}
