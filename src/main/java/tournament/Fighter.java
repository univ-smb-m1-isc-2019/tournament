package tournament;

public class Fighter {
    public int HP;
    public Weapon weapon;

    public int hitPoints() {
        if(this.HP < 0)
            this.HP = 0;
        return  this.HP;
    }

    public void engage(Fighter fighter) {

        while(!this.isDead() && !fighter.isDead()){
            this.HP = this.HP - fighter.weapon.getDmg();
            fighter.HP = fighter.HP - this.weapon.getDmg();
        }

    }

    public boolean isDead(){
        if(this.HP <= 0){
            return true;
        }
        else{
            return false;
        }

    }

    public Fighter equipF(String buckler) {
        return null;
    }
}
