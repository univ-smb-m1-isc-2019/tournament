package me.guillaume.tournament.skill;

import me.guillaume.tournament.Fighter;

/**
 * A fighter with the Veteran skill deals double damage
 * when his health is below 30% of his max HP.
 */
public class Veteran extends Skill {

    private static final int BERSERK_HEALTH_PERCENTAGE_THRESHOLD_TRIGGER = 30;
    private static final int BERSERK_DAMAGE_MULTIPLIER = 2;

    public Veteran(){
    }

    @Override
    public int damageModifier(int attackPower, Fighter fighter) {
        float fighterHealthPercentage = ((float) fighter.hitPoints() / (float) fighter.maxHitPoints()) * 100;

        if(fighterHealthPercentage < BERSERK_HEALTH_PERCENTAGE_THRESHOLD_TRIGGER){
            return attackPower * BERSERK_DAMAGE_MULTIPLIER;
        }

        return attackPower;
    }
}
