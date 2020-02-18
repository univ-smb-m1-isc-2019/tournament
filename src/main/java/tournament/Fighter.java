package tournament;

public abstract class Fighter {

    private int hitPoints;
    private int handFree;
    private Buckler buckler;
    private Armor armor;
    private int hitGiven;
    private String behaviour;



    private Weapon defaultWeapon;

    public Fighter(int hitPoints,String weapon)
    {
        setHitPoints(hitPoints);
        setBuckler(null);
        setArmor(null);
        setDefaultWeapon(new Weapon(weapon));
        setHitGiven(0);
        setBehaviour("none");
    }

    public Fighter(int hitPoints,String weapon,String behaviour)
    {

        setHitPoints(hitPoints);
        setBuckler(null);
        setArmor(null);
        setDefaultWeapon(new Weapon(weapon));
        setHitGiven(0);
        setBehaviour(behaviour);

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
        if(!fighter.getDefaultWeapon().hasMaxHit() ||
                (fighter.getDefaultWeapon().hasMaxHit() && fighter.getHitGiven() != fighter.getDefaultWeapon().getMaxHit())) {

            if (hasBuckler() && getBuckler().getDurability() > 0 && getBuckler().isWillCancel()) {
                nextLife = this.getHitPoints();
                if (fighter.getDefaultWeapon().isBucklerBreaker()) {
                    getBuckler().setDurability(getBuckler().getDurability() - 1);
                }

            } else {
                /*Dans le cas ou le bouclier ne bloque pas l'attaque, la prochaine valeur des hitPoints correspond
                 * aux degats de l'arme de l'attanquant moins la reduction de degats cause par l'armure qu'il peut porter
                 * moins les degats que l'armure que le receveur peut porter, si aucun des deux ne portent d'armure, l'amre fait des degats normaux*/

                nextLife = getHitPoints() - (fighter.getDefaultWeapon().getDamage()
                                            + fighter.addBehaviourDamages()
                                            - fighter.getArmorReducingDamage()
                                            - getArmorReducingShock());



                fighter.setHitGiven(getHitGiven() + 1);
            }
            if(hasBuckler() && getBuckler().getDurability()>0)
            {
                getBuckler().setWillCancel(!getBuckler().isWillCancel());
            }
        }
        else
        {
            nextLife = this.getHitPoints();
            fighter.setHitGiven(0);
        }

        setHitPoints(Math.max(nextLife, 0));

    }

    public int getArmorReducingDamage()
    {
        if(hasArmor())
        {
            return getArmor().getReduceDamage();
        }
        else
        {
            return 0;
        }
    }

    public int getArmorReducingShock()
    {
        if(hasArmor())
        {
            return getArmor().getReduceShock();
        }
        else
        {
            return 0;
        }
    }

    public abstract int addBehaviourDamages();


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
                setArmor(new Armor());
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

    public int getHitGiven() {
        return hitGiven;
    }

    public void setHitGiven(int hitGiven) {
        this.hitGiven = hitGiven;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }
}
