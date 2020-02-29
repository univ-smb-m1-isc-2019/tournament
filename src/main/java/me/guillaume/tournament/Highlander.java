package me.guillaume.tournament;

public class Highlander extends Fighter {
    private static final int HIT_POINTS = 150;
    private static final int DAMAGE_POINTS = 12;
    private static final int ARMOR_POINTS = 0;
    private static final int BUCKLER_POINTS = 0;
    private static final boolean AXE = false;
    private int greatSwordTurns = 3;
    private int berserkTreshold = 0;
    private boolean berserk = false;

    public Highlander() {
        super(HIT_POINTS, DAMAGE_POINTS, ARMOR_POINTS, BUCKLER_POINTS, AXE);
    }

    public Highlander(String type) {
        super(HIT_POINTS, DAMAGE_POINTS, ARMOR_POINTS, BUCKLER_POINTS, AXE);
        if ("Veteran".equals(type)) berserkTreshold = HIT_POINTS * 30 / 100;
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

    boolean isVeteran() { return berserkTreshold > 0; }

    boolean isBeyondBerserkTreshold() { return hitPoints < berserkTreshold; }

    void goBerserk() {
        damagePoints *= 2;
        berserk = true;
    }

    @Override
    void fight(Fighter fighter, boolean oneTurnOutOfTwo) {
        if(greatSwordTurns < 3) {
            super.fight(fighter, oneTurnOutOfTwo);
            greatSwordTurns++;
        } else greatSwordTurns = 1;

        if ( isVeteran() ) if (isBeyondBerserkTreshold() && !berserk) goBerserk();
    }
}
