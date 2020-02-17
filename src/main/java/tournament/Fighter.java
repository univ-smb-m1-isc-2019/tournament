package tournament;

public class Fighter {
    public int HP;
    public Weapon weapon;
    public Buckler buckler;

    public int hitPoints() {
        if(this.HP < 0)
            this.HP = 0;
        return  this.HP;
    }

    public void removeHitPoints(int hitPoints){
        this.HP = this.HP - hitPoints;
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

    public void engage(Fighter fighter) {

        boolean isBlowed = true;
        while(!this.isDead() && !fighter.isDead()){

            // Fighter 1 (this)
            if(this.hasABuckler()){
                if(isBlowed)
                    this.buckler.receiveBlow(fighter.weapon.getName());
                else
                    this.removeHitPoints(fighter.weapon.getDmg());
            }
            else{
                this.removeHitPoints(fighter.weapon.getDmg());
            }

            // Fighter 2 (fighter)
            if(fighter.hasABuckler()){
                if(isBlowed)
                    fighter.buckler.receiveBlow(this.weapon.getName());
                else
                    fighter.removeHitPoints(this.weapon.getDmg());
            }
            else{
                fighter.removeHitPoints(this.weapon.getDmg());
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
                // code block
                break;
            default:
                // code block
        }

        return this;
    }
}
