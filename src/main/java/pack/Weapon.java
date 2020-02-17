package pack;

public class Weapon {
    private static int weaponKind ; // 1 pour arme à une main, 2 pour arme à deux mains
    private static boolean shieldBreaker ; // vrai si l'arme fait des degats aux boucliers
    private int damage;
    private int damageToShields; //Au cas ou l'on ai plus d'armes, dont certaines faisant plus d'un degat aux boucliers

    public Weapon (String name ){
        switch ( name ){
            case"Axe":
                this.shieldBreaker = true;
                this.weaponKind = 1;
                this.damage = 6;
                this.damageToShields = 1;
                break;
            case"Sword":
                this.shieldBreaker = false;
                this.weaponKind = 1;
                this.damage = 5;
                this.damageToShields = 0;
                break;
            case"Greatsword":
                this.shieldBreaker = false;
                this.weaponKind = 2;
                this.damage = 12;
                this.damageToShields = 0;
                break;
            default:
                this.shieldBreaker = false;
                this.weaponKind = 0;
                this.damage = 0;
                this.damageToShields = 0;
                break;
        }
    }

    public int getDamage() {
        return this.damage;
    }

    public boolean isTwoHandsWeapon(){
        return this.weaponKind == 2;
    }

    public boolean isShieldBreaker(){
        return this.shieldBreaker;
    }

    public int getDamageToShield() {
        return this.damageToShields;
    }
}
