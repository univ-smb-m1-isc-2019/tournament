package tournament;

public class Fighter {

    public int hp;
    public int dmg;
    public String mainhand;
    public String offhand;
    public boolean armor;
    public int deuxFoisSurTrois;

    public Fighter() {
        armor = false;
        deuxFoisSurTrois = 0;
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
            if (this.deuxFoisSurTrois < 2){
                if(fighter.gotShield())
                {
                    if(!blockedB && shieldDestroyB < 3){
                        blockedB = true;
                        if(this.gotAxe()) shieldDestroyB++;
                    }
                    else {
                        fighter.blow(this.dmg);
                        blockedB = false;
                    }

                } else
                    fighter.blow(this.dmg);

                if(this.got2HandSword()) this.deuxFoisSurTrois++;
            }
            else{
                this.deuxFoisSurTrois = 0;
            }

            /** B engage A **/

            if(fighter.deuxFoisSurTrois < 2){

                if(fighter.getHp() > 0) {

                    if(this.gotShield())
                    {
                        if(!blockedA && shieldDestroyA < 3 )
                        {
                            blockedA = true;
                            if(fighter.gotAxe()) shieldDestroyA++;
                        }
                        else {
                            this.blow(fighter.dmg);
                            blockedA = false;
                        }
                    }
                    else this.blow(fighter.dmg);
                }

                if(fighter.got2HandSword()) fighter.deuxFoisSurTrois++;
            }
                else{
                fighter.deuxFoisSurTrois = 0;
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
        if(this.armor)
        {
            dmg -= 3;
        }

        // Si l'attaque ne le tue pas
        if(this.getHp() - dmg > 0)
            this.setHp(this.getHp() - dmg); // on lui change la vie
        else this.setHp(0); // sinon il est mort
    }

    public Fighter equip(String buckler) {

        if (buckler == "armor"){
            this.armor = true;
            this.dmg = this.dmg -1;
        }

        else{
            if(mainHandIsEmpty())
                this.mainhand = buckler;
            if(offHandIsEmpty())
                this.offhand = buckler;
        }
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

    public boolean got2HandSword(){
        if(!mainHandIsEmpty())
        {
            if(this.mainhand == "Great Sword")
                return true;
        }
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
