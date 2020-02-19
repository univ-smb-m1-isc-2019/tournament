package pack;

public abstract class Warrior{
    private int hp;
    private Buckler buckler;
    private Weapon weapon;
    private Armor armor;
    private int resistance;

    public Warrior(int hp,Weapon weapon){
        this.hp=hp;
        this.buckler = null;
        this.armor = null;
        this.weapon = weapon;
        this.resistance=0;
    }
    /*
        public Warrior(int hp,Weapon weapon, String stuff) {
            this.hp = hp;
            this.Buckler = null;
            this.weapon = weapon;
            equipGear(stuff);
        }
    */
    private void equipGear ( String stuff ){
        switch ( stuff ){
            case "buckler":
                this.buckler = new Buckler();
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
        //System.out.println (enemy.weapon.consecutiveShotsMade);
        //System.out.println (enemy.weapon.consecutiveShotsPossible);
        if ( enemy.canAttack() ){// si l'arme de l'enemi lui permet d'attaquer ce tour
            enemy.attack(this);
            if ( hasBuckler() ){//Si on a un Buckler
                if ( bucklerIsBroken() ){//Si le Buckler est cassé, on prend le coup
                    decreaseHealthPoints(enemy.getDamage()-resistance());
                }
                else if ( hasParryLastTurn() ){//Le Buckler a été utilisé au tour d'avant, alors on prend le coup
                    bucklerHasNotParryThisTurn(); //On indique que le Buckler vient de passer son tour
                    decreaseHealthPoints(enemy.getDamage()-resistance());
                }
                else{//Le Buckler n'est pas cassé et est utilisable a ce tour :
                    parry(enemy.getWeapon());
                    //buckler.decreaseDurability(enemy.weapon.getDamageToShield());
                }
            }
            else {//Sans Buckler, on prend directement le coup
                decreaseHealthPoints(enemy.getDamage()-resistance());
            }
        }//fin if attaque
        else{
            enemy.weapon.passTurn();
        }
    }

    private int resistance() {
        return this.resistance;
    }

    private Weapon getWeapon() {
        return this.weapon;
    }

    private void bucklerHasNotParryThisTurn() {
        buckler.passTurn();
    }

    private boolean hasBuckler() {
        return buckler != null;
    }

    private void parry(Weapon weapon) {
        buckler.parer(weapon);
    }

    private boolean hasParryLastTurn() {
        return buckler.vientDeParer();
    }

    private boolean bucklerIsBroken() {
        return  buckler.estCasse();
    }

    private void attack(Warrior warrior) {
        this.weapon.attack();
    }

    private boolean canAttack() {
        return weapon.canAttack();
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