package me.guillaume.tournament.equipement.defense;

import me.guillaume.tournament.equipement.weapon.OneHandAxe;
import me.guillaume.tournament.equipement.weapon.Weapon;

/**
 * A Buckler blocks all incoming damage of a blow one time out of two
 * but can be broken if an axe hit it three times.
 */
public class Buckler extends Defense {

    private static final int DEFAULT_NUMBER_OF_USES = 3;

    private int numberOfUses;
    private boolean canBeUsed;

    public Buckler(){
        this.numberOfUses = DEFAULT_NUMBER_OF_USES;
        this.canBeUsed = true;
    }

    @Override
    public int damageModifier(int attackPower) {
        return attackPower;
    }

    @Override
    public int defenseModifier(int damageTaken, Weapon attackerWeapon) {
        if(!usable()) {
            canBeUsed = true;
            return damageTaken;
        }

        if(attackerWeapon instanceof OneHandAxe) numberOfUses -=1;

        canBeUsed = false;
        return 0;
    }

    private boolean usable(){
        return numberOfUses > 0 && canBeUsed;
    }

}
