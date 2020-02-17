package me.guillaume.tournament;

public class Armor extends Defense {

    private static final int DAMAGE_MODIFIER = -1;
    private static final int DEFENSE_MODIFIER = 3;

    public Armor(){

    }

    @Override
    public int damageModifier(int attackPower) {
        return attackPower + DAMAGE_MODIFIER;
    }

    @Override
    public int defenseModifier(int damageTaken, Weapon attackerWeapon) {
        return damageTaken - DEFENSE_MODIFIER;
    }
}
