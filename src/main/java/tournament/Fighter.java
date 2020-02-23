package tournament;

public class Fighter {

    public int hp;
    public int baseHp;
    public int dmg;
    public String mainhand;
    public String offhand;
    public boolean armor;
    public int poisonTicks;
    public boolean veteran;
    public boolean vicious;

    public Weapon hands;

    public Fighter() {
        armor = false;
        vicious = false;
        veteran = false;
        poisonTicks = 0;
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

                    if (this.getHands().attack() != 0)
                        blockedB = true;
                    if(this.gotAxe()) shieldDestroyB++;
                }
                else {
                    fighter.blow(this);
                    blockedB = false;
                }

            } else
                fighter.blow(this);


            /** B engage A **/
            if(fighter.getHp() > 0) {

                if(this.gotShield())
                {
                    if(!blockedA && shieldDestroyA < 3 )
                    {
                        if (fighter.getHands().attack() != 0)
                            blockedA = true;
                        if(fighter.gotAxe()) shieldDestroyA++;
                    }
                    else {
                        this.blow(fighter);
                        blockedA = false;
                    }
                }
                else this.blow(fighter);
            }
            // System.out.println("f1 = " + this.getHp() + " f2 = " + fighter.getHp());
        }
    }

    /** Renvoi le nombre d'HP du combattant **/
    public int hitPoints() {
        return this.hp;
    }

    /** Fonction qui retire un nombre de HP donné en paramètre au combattant **/
    public void blow(Fighter opponent)
    {
        int dmg = opponent.getHands().attack();
        if(opponent.veteran)
        {
            // Il devient berserk à 30%
            if(opponent.getHp() < (opponent.baseHp*30)/100){
                dmg = dmg *2; // berserk = dégats *2
            }

        }

        if(opponent.vicious)
        {
            if(this.poisonTicks < 2)
            {
                dmg += 20;
                poisonTicks++;
            }
        }

        if(this.armor)
        {
            dmg -= 3;
        }
        if(opponent.armor)
            dmg -= 1;

        if(dmg < 0) dmg=0;

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
            else if(offHandIsEmpty())
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
    public int getHp() {
        return hp;
    }

    public Weapon getHands()
    {
        return hands;
    }

    /** Setters **/
    public void setHp(int hp) {
        this.hp = hp;
    }
}
