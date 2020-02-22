package tournament;

public class Fighter {
    public int HP;
    public String name;
    public Weapon weapon;
    public Buckler buckler;
    public Armor armor;
    public int nbPoisonBlow;
    public boolean Vicious;
    public boolean Veteran;
    public int percentage30;

    public Fighter(){
        this.Vicious = false;
        this.Veteran = false;
    }

    public int hitPoints() {
        if(this.HP < 0)
            this.HP = 0;
        return  this.HP;
    }

    public void powerFighter(String str){
        if(str == "Vicious"){
            this.Vicious = true;
            this.nbPoisonBlow = 2;
        }
        if(str == "Veteran"){
            this.Veteran = true;
            // (30/100)*150 = 45
            this.percentage30 = 45;
        }
    }

    public int fighterIsVicious(Fighter fighter, int damages){
        if(fighter.nbPoisonBlow > 0 && damages > 0) {
            fighter.nbPoisonBlow = fighter.nbPoisonBlow - 1;
            return damages + 20;
        }
        else
            return damages;
    }

    public int fighterIsVeteran(Fighter fighter, int damages){
        if(fighter.HP <= fighter.percentage30 && damages > 0)
            return damages * 2;
        else
            return damages;
    }


    public int armorDeliveredDamages(Fighter fighter){
        if ((fighter.weapon.getDmg() - fighter.armor.delivered_damages) > 0)
            return fighter.weapon.getDmg() - fighter.armor.delivered_damages;
        else
            return 0;
    }

    public int armorReceivedDamages(int damages, Fighter fighter){
        if ((damages - this.armor.received_damages) > 0)
            return damages - this.armor.received_damages;
        else
            return 0;
    }

    public void removeHitPoints(Fighter fighter){
        int Dmg;
        if(fighter.hasAArmor()) {
            Dmg = armorDeliveredDamages(fighter);
        }
        else
            Dmg = fighter.weapon.getDmg();

        if(fighter.Vicious)
            Dmg = fighterIsVicious(fighter, Dmg);

        if(fighter.Veteran)
            Dmg = fighterIsVeteran(fighter, Dmg);


        if(this.hasAArmor()) {
            this.HP = this.HP - armorReceivedDamages(Dmg, fighter);
        }
        else
            this.HP = this.HP - Dmg;

    }

    public boolean hasABuckler(){
        if(this.buckler == null)
            return false;
        else{
            if(this.buckler.isDestroy())
                return false;
            else
                return true;

        }
    }

    public boolean hasAArmor(){
        if(this.armor == null)
            return false;
        else
            return true;
    }

    public void engage(Fighter fighter) {

        boolean isBlowed = false;
        while(!this.isDead() && !fighter.isDead()){

            // Fighter 1 (this)
            if(this.hasABuckler()){
                this.buckler.receiveBlow(this, fighter, isBlowed);
            }
            else{
                this.removeHitPoints(fighter);
            }

            // Fighter 2 (fighter)
            if(fighter.hasABuckler()){
                fighter.buckler.receiveBlow(fighter,this, isBlowed);
            }
            else{
                fighter.removeHitPoints(this);
            }

            isBlowed = !isBlowed;
        }

    }

    public void changeWeapon( String name, int dmg, int nbHand){

        this.weapon = new Weapon(name,dmg,nbHand);
    }

    public boolean isDead(){
        if(this.HP <= 0){
            return true;
        }
        else{
            return false;
        }

    }

    public Fighter equipF(String equip) {
        switch(equip) {
            case "buckler":
                this.buckler = new Buckler();
                break;
            case "armor":
                this.armor = new Armor();
                break;
            case "axe":
                this.changeWeapon("axe",6,1);
                break;
            default:
                // code block
        }

        return this;
    }
}
