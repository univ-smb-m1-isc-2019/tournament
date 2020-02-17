package pack;

public abstract class Warrior{
    private int hp;
    private Bouclier bouclier;
    private Weapon weapon;

    public Warrior(int hp,Weapon weapon){
        this.hp=hp;
        this.bouclier = null;
        this.weapon = weapon;
    }

    public Warrior(int hp,Weapon weapon, String stuff) {
        this.hp = hp;
        this.bouclier = null;
        this.weapon = weapon;
        equipGear(stuff);

    }

    private void equipGear ( String stuff ){
        switch ( stuff ){
            case "buckler":
                this.bouclier = new Bouclier();
                break;
            default:
                break;
        }
    }

    public int getDamage (){
        return this.weapon.getDamage();
    }

    //Retourne le nombre de pv restants
    public int hitPoints() {
        return hp;
    }

    public void engage(Warrior warrior) {
        while(this.hp > 0 && warrior.hitPoints()>0){
            //System.out.println (" Guerrier 1 : " +this.hp +" Guerrier 2 "+ warrior.hitPoints());
            //Les deux combattants se frappent
            getHit(warrior);
            warrior.getHit(this);
        }
    }
    //Quand on est frappé par le guerrier donné en parametre, on fait ce qu'il faut pour gérer les équipements et points de vie
    public void getHit(Warrior enemy){

        if ( bouclier != null ){
            if ( bouclier.estCasse() || bouclier.vientDeParer() ){
                decreaseHealthPoints(enemy.weapon.getDamage());
            }
            if ( enemy.weapon.isShieldBreaker() ){
                bouclier.decreaseDurability(enemy.weapon.getDamageToShield());
            }
        }
        else {
            decreaseHealthPoints(enemy.weapon.getDamage());
        }

    }
    //On retire les hp, on gère pour ne pas tomber en dessous de 0 hp.
    private void decreaseHealthPoints(int damage){
        this.hp = this.hp - damage;
        if ( this.hp < 0){
            this.hp = 0;
        }
    }

}
