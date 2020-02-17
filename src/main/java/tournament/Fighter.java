package tournament;

public class Fighter {

    public int hp;
    public int dmg;
    public Weapon mainhand;
    public Weapon offhand;

    public Fighter() {
    }


    /** Tant qu'un des deux combattants n'est pas mort, ils s'attaquent à tour de rôle **/
    public void engage(Fighter fighter) {

        while( (fighter.getHp() > 0) && (this.getHp() > 0))
        {
            // A engage B
            fighter.blow(this.dmg);
            if(fighter.getHp() > 0) // B engage A
            {
                this.blow(fighter.dmg);
            }
        }

    }

    /** Renvoi le nombre d'HP du combattant **/
    public int hitPoints() {
        return this.hp;
    }

    /** Fonction qui retire un nombre de HP donné en paramètre au combattant **/
    public void blow(int dmg)
    {
        if(this.getHp() - dmg > 0)
            this.setHp(this.getHp() - dmg);
        else this.setHp(0);
    }

    public Fighter equip(String buckler) {
        if(mainHandIsEmpty())
            this.mainhand = new Weapon(buckler);
        else
            this.offhand = new Weapon(buckler);
        return this;
    }

    public boolean mainHandIsEmpty()
    {
        return this.mainhand == null;
    }

    /** Getters **/
    public int getDmg() {
        return dmg;
    }
    public int getHp() {
        return hp;
    }
    public Weapon getMainhand() {
        return mainhand;
    }
    public Weapon getOffhand() {
        return offhand;
    }

    /** Setters **/
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}
