package me.guillaume.tournament;

public abstract class Defense extends Equipment {

    public Defense(){

    }

    public abstract int damageModifier(int attackPower);
    public abstract int defenseModifier(int damageTaken, Weapon attackerWeapon);
}
