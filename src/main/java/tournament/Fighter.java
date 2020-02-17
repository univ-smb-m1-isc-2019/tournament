package tournament;

public class Fighter {

    public int hp;
    public int dmg;
    public String mainhand;
    public String offhand;

    public Fighter() {
    }


    /** Tant qu'un des deux combattants n'est pas mort, ils s'attaquent à tour de rôle **/
    public void engage(Fighter fighter) {

        boolean blockedB = false;
        int shieldDestroyB = 0;
        boolean blockedA = false;
        int shieldDestroyA = 0;

        while( (fighter.getHp() > 0) && (this.getHp() > 0))
        {
            /** A engage B **/
            if(fighter.gotShield())
            {
                if(!blockedB && shieldDestroyB < 3){
                    blockedB = true;
                    if(this.gotAxe()) shieldDestroyB++;
                }
                else{
                    fighter.blow(this.dmg);
                    blockedB = false;
                }
            } else
                fighter.blow(this.dmg);

            /** B engage A **/
            if(fighter.getHp() > 0) {

                if(this.gotShield())
                {
                    if(!blockedA && shieldDestroyA < 3 )
                    {
                        blockedA = true;
                        if(fighter.gotAxe()) shieldDestroyA++;
                    }
                    else{
                        this.blow(fighter.dmg);
                        blockedA = false;
                    }
                }
                else this.blow(fighter.dmg);
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
            this.mainhand = buckler;
        if(offHandIsEmpty())
            this.offhand = buckler;
        return this;
    }


    public boolean mainHandIsEmpty()
    {
        return this.mainhand == null;
    }
    public boolean offHandIsEmpty()
    {
        return this.offhand == null;
    }

    public boolean gotShield(){
        if(!mainHandIsEmpty())
            if(this.mainhand == "buckler")
                return true;
        if(!offHandIsEmpty())
            if (this.offhand == "buckler" )
                return true;
        return false;
    }

    public boolean gotAxe(){
        if(!mainHandIsEmpty())
            if(this.mainhand == "Axe")
                return true;
        if(!offHandIsEmpty())
            if (this.offhand == "Axe" )
                return true;
        return false;
    }

    /** Getters **/
    public int getDmg() {
        return dmg;
    }
    public int getHp() {
        return hp;
    }
    public String getMainhand() {
        return mainhand;
    }
    public String getOffhand() {
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
