package pack;

public abstract class Warrior{
    private int hp;
    private Bouclier bouclier;
    private Weapon weapon;
    private Armor armor;
    private int resistance;

    public Warrior(int hp,Weapon weapon){
        this.hp=hp;
        this.bouclier = null;
        this.armor = null;
        this.weapon = weapon;
        this.resistance=0;
    }
/*
    public Warrior(int hp,Weapon weapon, String stuff) {
        this.hp = hp;
        this.bouclier = null;
        this.weapon = weapon;
        equipGear(stuff);

    }
*/
    private void equipGear ( String stuff ){
        switch ( stuff ){
            case "buckler":
                this.bouclier = new Bouclier();
                break;
            case"armor":
                this.armor = new Armor();
                this.weapon.reduceDamages(armor.outputDamagesReduction());
                this.resistance = armor.damageReduction();
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
            System.out.println ("AVANT  Guerrier 1 : " +this.hp +" Guerrier 2 "+ warrior.hp);
            //Les deux combattants se frappent
            getHit(warrior);
            warrior.getHit(this);
            System.out.println ("APRES  Guerrier 1 : " +this.hp +" Guerrier 2 "+ warrior.hp);
            System.out.println ("-------------------------------------------------------------");
        }
    }
    //Quand on est frappé par le guerrier donné en parametre, on fait ce qu'il faut pour gérer les équipements et points de vie
    public void getHit(Warrior enemy){
        System.out.println (enemy.weapon.consecutiveShotsMade);
        System.out.println (enemy.weapon.consecutiveShotsPossible);
        if ( enemy.weapon.canAttack() ){// si l'arme de l'enemi lui permet d'attaquer ce tour
            enemy.weapon.attack();
            if ( bouclier != null ){//Si on a un bouclier
                if ( bouclier . estCasse() ){//Si le bouclier est cassé, on prend le coup
                    //enemy.weapon.attack();
                    decreaseHealthPoints(enemy.weapon.getDamage()-this.resistance);
                }
                else if ( bouclier.vientDeParer()){//Le bouclier a été utilisé au tour d'avant, alors on prend le coup
                    //enemy.weapon.attack();
                    bouclier.passTurn(); //On indique que le bouclier vient de passer son tour
                    decreaseHealthPoints(enemy.weapon.getDamage()-this.resistance);
                }
                else{//Le bouclier n'est pas cassé et est utilisable a ce tour :
                    bouclier.parer();
                    bouclier.decreaseDurability(enemy.weapon.getDamageToShield());
                }
            }
            else {//Sans bouclier, on prend directement le coup
                decreaseHealthPoints(enemy.weapon.getDamage()-this.resistance);
            }
        }//fin if attaque
        else{
            enemy.weapon.passTurn();

        }


    }
    //On retire les hp, on gère pour ne pas tomber en dessous de 0 hp.
    private void decreaseHealthPoints(int damage){
        this.hp = this.hp - damage;
        if ( this.hp < 0){
            this.hp = 0;
        }
    }

    protected Warrior equip(String stuff) {
        equipGear(stuff);
        return this;
    }
}
