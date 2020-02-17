package pack;

public class Bouclier {
    private static final int DEFAULT_DURABILITY = 3 ;
    private static final boolean DEFAULT_STATE = false;
    private int durability;
    private boolean vientDeParer;


    public Bouclier(){
        this.durability = DEFAULT_DURABILITY;
        this.vientDeParer = DEFAULT_STATE;
    }

    public boolean vientDeParer(){
        return this.vientDeParer;
    }

    public int getDurability(){
        return this.durability;
    }

    public void decreaseDurability(int damage){
        if(this.durability > 0){
            this.durability-=damage;
        }
    }

    public boolean estCasse(){
        return this.durability <= 0;
    }

    public void parer(){
        this.vientDeParer = true;
    }

    public void passTurn(){
        this.vientDeParer = false;
    }
}
