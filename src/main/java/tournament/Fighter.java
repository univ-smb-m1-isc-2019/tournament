package tournament;

public abstract class Fighter {

    private int hitPoints;
    private int handFree;
    private Buckler buckler;
    private Armor armor;



    private Weapon defaultWeapon;

    public Fighter(int hitPoints,String weapon)
    {
        setHitPoints(hitPoints);
        setBuckler(null);
        setArmor(null);
        setDefaultWeapon(new Weapon(weapon));
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
        int nextLife;
        if(hasBuckler() && getBuckler().getDurability() > 0 && getBuckler().isWillCancel())
        {
            nextLife = this.getHitPoints();
            if(fighter.getDefaultWeapon().isBucklerBreaker())
            {
                getBuckler().setDurability(getBuckler().getDurability()-1);
            }

        }
        else
        {
            nextLife = getHitPoints() - fighter.getDefaultWeapon().getDamage();
        }

        if(hasBuckler() && getBuckler().getDurability()>0)
        {
            getBuckler().setWillCancel(!getBuckler().isWillCancel());
        }

        setHitPoints(Math.max(nextLife, 0));
    }



    public Fighter equip(String equipement)
    {
        switch (equipement){
            case"buckler":
                if (!hasBuckler() && getHandFree() == 0)
                {
                    setBuckler(new Buckler());
                    setHandFree(2 - getBuckler().getHandNeeded());
                    setDefaultWeapon(new Weapon("none"));
                }else if(!hasBuckler() && getHandFree() > 0)
                {
                    setBuckler(new Buckler());
                }

                break;

            case "armor":

                break;

            case"axe":
                setDefaultWeapon(new Weapon(equipement));
                if(getHandFree() == 0 && !hasBuckler())
                {
                    setHandFree(2 - getDefaultWeapon().getHandNeeded());
                }

                break;
            default:
                break;

        }

        return this;
    }

    public boolean isNotDead()
    {
        return getHitPoints() > 0;
    }

    public int hitPoints()
    {
        return getHitPoints();
    }

    public boolean hasBuckler()
    {
        return getBuckler() != null;
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;
    }
    public int getHitPoints()
    {
        return this.hitPoints;
    }

    public void setHandFree(int handFree){this.handFree = handFree;}
    public int getHandFree(){return this.handFree;}

    public void setBuckler(Buckler buckler) {
        this.buckler = buckler;
    }

    public Buckler getBuckler() {
        return buckler;
    }

    public void setDefaultWeapon(Weapon defaultWeapon) {
        this.defaultWeapon = defaultWeapon;
    }

    public Weapon getDefaultWeapon() {
        return defaultWeapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Armor getArmor() {
        return armor;
    }

    public boolean hasArmor()
    {
        return getArmor() != null;
    }


}
