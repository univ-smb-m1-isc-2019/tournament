package me.guillaume.tournament;

public class Highlander extends Fighter {
    private static final int HIT_POINTS = 150;
    private static final int DAMAGE_POINTS = 12;
    private static final int ARMOR_POINTS = 0;
    private static final int BUCKLER_POINTS = 0;
    private static final boolean AXE = false;
    private int greatSword = 3;

    public Highlander() {
        super(HIT_POINTS, DAMAGE_POINTS, ARMOR_POINTS, BUCKLER_POINTS, AXE);
    }

    public Highlander(String type) {
        super(HIT_POINTS, DAMAGE_POINTS, ARMOR_POINTS, BUCKLER_POINTS, AXE);
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

    @Override
    void fight(Fighter fighter, boolean oneTurnOutOfTwo) {
        if(greatSword < 3) {
            super.fight(fighter, oneTurnOutOfTwo);
            greatSword++;
        } else {
            greatSword = 1;
        }
    }
}
 