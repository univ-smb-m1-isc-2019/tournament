package me.guillaume.tournament.equipement.weapon;

/**
 * A GreatSword deals a lot of damage but is heavy.
 * The fighter will be able to attack only 2 out of 3 times.
 */
public class GreatSword extends Weapon {

    private static final int POWER = 12;
    private static final int ATTACK_SPEED = 2;

    public GreatSword(){
        super(POWER, ATTACK_SPEED);
    }
}
