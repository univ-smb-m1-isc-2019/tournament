package me.guillaume.tournament;

public class GreatSword extends Weapon {

    private final static int NB_ATTACK = 2;
    private final static int GREAT_SWORD_DAMAGE = 12;

    private int nbAttackActual;

    public GreatSword(String typeWeapon) {
        super(typeWeapon);
        this.nbAttackActual = NB_ATTACK;
        this.damage = GREAT_SWORD_DAMAGE;
    }

    public void attackGreatSword(){
        if(nbAttackActual == -1) {
            this.nbAttackActual = NB_ATTACK;
            this.damage = GREAT_SWORD_DAMAGE;
        }

        if (nbAttackActual == 0)
            this.damage = 0;

        nbAttackActual--;
    }

}
