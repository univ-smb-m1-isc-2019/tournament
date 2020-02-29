package me.guillaume.tournament.equipement.defense;

import me.guillaume.tournament.equipement.Equipment;
import me.guillaume.tournament.equipement.weapon.Weapon;

public abstract class Defense extends Equipment {

    public abstract int damageModifier(int attackPower);
    public abstract int defenseModifier(int damageTaken, Weapon attackerWeapon);
}
