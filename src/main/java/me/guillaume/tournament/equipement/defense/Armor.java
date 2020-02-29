package me.guillaume.tournament.equipement.defense;

import me.guillaume.tournament.equipement.weapon.Weapon;


/**
 * An Armor reduce incoming damage by 3 points
 * but also reduce damage dealt by 1.
 */
public class Armor extends Defense {

    private static final int DAMAGE_MODIFIER = -1;
    private static final int DEFENSE_MODIFIER = 3;

    public Armor(){}

    @Override
    public int damageModifier(int attackPower) {
        return attackPower + DAMAGE_MODIFIER;
    }

    @Override
    public int defenseModifier(int damageTaken, Weapon attackerWeapon) {
        return damageTaken - DEFENSE_MODIFIER;
    }
}
