package me.guillaume.tournament;

public class GreatSword extends Weapon{

    private static final int POWER = 12;
    private static final int ATTACK_SPEED = 2;
    private static final int HANDLING_TYPE = 2;

    public GreatSword(){
        super(POWER, ATTACK_SPEED, HANDLING_TYPE);
    }
}
