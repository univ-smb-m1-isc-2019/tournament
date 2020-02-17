package pack;

public abstract class Warrior{
    private int hp;
    private int damage;
    private Bouclier bouclier;

    public Warrior(int hp, int damage){
        this.hp=hp;
        this.damage=damage;
        this.bouclier = null;
    }

    public Warrior(int hp, int damage,  String stuff) {
        this.hp = hp;
        this.damage=damage;
        this.bouclier = null;
        equipGear(stuff);

    }

    private void equipGear ( String stuff ){
        switch ( stuff ){
            case " buckler ":
                this.bouclier = new Bouclier();
                break;
            default:
                break;
        }
    }

    public int getDamage (){
        return this.damage;
    }

    //Retourne le nombre de pv restants
    public int hitPoints() {
        return hp;
    }

    public void engage(Warrior warrior) {
        while(this.hp > 0 && warrior.hitPoints()>0){
            //System.out.println (" Guerrier 1 : " +this.hp +" Guerrier 2 "+ warrior.hitPoints());
            //Les deux combattants se frappent
            getHit(warrior.getDamage());
            warrior.getHit(getDamage());
        }
    }
    //Quand on est frappé. On fait les tests pour voir si on va perdre de la vie ou non.
    public void getHit(int damage){
        if ( bouclier.estCasse() || bouclier.vientDeParer() ){
            decreaseHealthPoints(damage);
        }
    
    }

    private void decreaseHealthPoints(int damage){
        this.hp = this.hp - damage;
        if ( this.hp < 0){
            this.hp = 0;
        }
    }

}
