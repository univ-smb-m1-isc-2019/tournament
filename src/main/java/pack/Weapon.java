package pack;

public class Weapon {
    public int consecutiveShotsPossible;
    public int consecutiveShotsMade;
    private static int weaponKind ; // 1 pour arme à une main, 2 pour arme à deux mains
    private int damage;
    private int damageToShields; //Au cas ou l'on ai plus d'armes, dont certaines faisant plus d'un degat aux Bucklers


    public Weapon (String name ){
        this.consecutiveShotsMade = 0;
        switch ( name ){
            case"Axe":
                this.weaponKind = 1;
                this.damage = 6;
                this.damageToShields = 1;
                this.consecutiveShotsPossible = -1;
                break;
            case"Sword":
                this.weaponKind = 1;
                this.damage = 5;
                this.damageToShields = 0;
                this.consecutiveShotsPossible = -1;
                break;
            case"Greatsword":
                this.weaponKind = 2;
                this.damage = 12;
                this.damageToShields = 0;
                this.consecutiveShotsPossible = 2;
                break;
            default:
                this.weaponKind = 0;
                this.damage = 0;
                this.damageToShields = 0;
                this.consecutiveShotsPossible = -1;
                break;
        }

    }

    public int getDamage() {
        return this.damage;
    }

    public void attack(){
        this.consecutiveShotsMade +=1;
    }
    public void passTurn(){
        this.consecutiveShotsMade = 0;
    }

    public boolean canAttack(){//Ne peux pas atatcker si elle a deja attacké consecutivement, le nombre de fois max qu'elle peut attaquer consecutivement
        return consecutiveShotsMade != consecutiveShotsPossible;
    }

    public boolean isTwoHandsWeapon(){
        return this.weaponKind == 2;
    }

    public int getDamageToShield() {
        return this.damageToShields;
    }

    public void reduceDamages(int outputDamagesReduction) {
        this.damage -= outputDamagesReduction;
    }
}
