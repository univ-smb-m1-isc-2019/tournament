package tournament;

public class Weapon {
    public String name;
    public int dmg;
    public int nbHand;
    public int counter;

    public Weapon( String name, int dmg, int nbHand){
        this.name = name;
        this.dmg = dmg;
        this.nbHand = nbHand;
        this.counter = 0;

    }

    public String getName(){
        return this.name;
    }

    public int getDmg(){
        int count;
        if(this.name == "Great Sword"){

            if( this.counter == 0 ) {
                count = this.counter + 1;
                this.counter = count%3;
                return 0;
            }
            else {
                count = this.counter + 1;
                this.counter = count%3;
                return this.dmg;
            }
        }
        else{
            return this.dmg;
        }
    }

    public int getNbHand(){
        return this.nbHand;
    }

    public int getCounter(){
        return this.counter;
    }
}
