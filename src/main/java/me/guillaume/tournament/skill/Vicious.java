package me.guillaume.tournament.skill;

import me.guillaume.tournament.Fighter;

/**
 * A fighter with the vicious skill deals 20 poison
 * damage on the first two blows.
 */
public class Vicious extends Skill {

    private static final int BONUS_POISON_DAMAGE = 20;
    private static final int NUMBER_OF_APPLICABLE_EFFECT = 2;

    private int currentNumberOfApplicableEffect;

    public Vicious(){
        this.currentNumberOfApplicableEffect = NUMBER_OF_APPLICABLE_EFFECT;
    }

    @Override
    public int damageModifier(int attackPower, Fighter fighter) {
        if(currentNumberOfApplicableEffect > 0){
            currentNumberOfApplicableEffect--;
            return attackPower + BONUS_POISON_DAMAGE;
        }
        return attackPower;
    }
}
