package me.guillaume.tournament;

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
        if(numberOfUses <= 0 || !canBeUsed) {
            canBeUsed = true;
            return damageTaken;
        }

        if(attackerWeapon instanceof OneHandAxe) numberOfUses -=1;
        canBeUsed = false;
        return 0;
    }


}
