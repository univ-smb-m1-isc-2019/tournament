package tournament;

public class Fighter {
    public int HP;
    public String name;
    public Weapon weapon;
    public Buckler buckler;
    public Armor armor;

    public int hitPoints() {
        if(this.HP < 0)
            this.HP = 0;
        return  this.HP;
    }
//
    public void removeHitPoints(Fighter fighter){
        int Dmg;
        if(fighter.hasAArmor()) {
            if ((fighter.weapon.getDmg() - fighter.armor.delivered_damages) > 0)
                Dmg = fighter.weapon.getDmg() - fighter.armor.delivered_damages;
            else
                Dmg = 0;
        }
        else
            Dmg = fighter.weapon.getDmg();

        if(this.hasAArmor()) {
            if ((Dmg - this.armor.received_damages) > 0)
                this.HP = this.HP - (Dmg - this.armor.received_damages);
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
