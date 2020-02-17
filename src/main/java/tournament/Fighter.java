package tournament;

public class Fighter {
    public int HP;

    public int hitPoints() {
        if(this.HP < 0)
            this.HP = 0;
        return  this.HP;
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
