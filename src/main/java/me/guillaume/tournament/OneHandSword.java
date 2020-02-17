package me.guillaume.tournament;

public class OneHandSword extends Weapon{

    private static final int POWER = 5;
    private static final int ATTACK_SPEED = 0;
    private static final int HANDLING_TYPE = 1;

    public OneHandSword(){
        super(POWER, ATTACK_SPEED, HANDLING_TYPE);
    }
}
