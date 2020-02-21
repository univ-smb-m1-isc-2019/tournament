package tournament;

public class Buckler {

    public int blow;
    public int nbHand;
    public boolean destroy;

    public Buckler(){
        this.blow = 3;
        this.nbHand = 1;
        this.destroy = false;

    }

    public void receiveBlow(Fighter fighterA, Fighter fighterB, boolean isBlowed){

        if(isBlowed){
            if(fighterB.weapon.getName() == "axe"){
                this.blow -= 1;
                if(this.blow <= 0)
                    this.destroy = true;
            }
        }
        else{
            fighterA.removeHitPoints(fighterB);
        }
    }

    public boolean isDestroy(){
        return this.destroy;
    }
}
