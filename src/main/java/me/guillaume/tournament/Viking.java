package me.guillaume.tournament;

public class Viking extends Fighter {
    private static final int HIT_POINTS = 120;
    private static final int DAMAGE_POINTS = 6;
    private static final int ARMOR_POINTS = 0;
    private static final int BUCKLER_POINTS = 0;
    private static final boolean AXE = true;

    public Viking() {
        super(HIT_POINTS, DAMAGE_POINTS, ARMOR_POINTS, BUCKLER_POINTS, AXE);
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

    Viking equip(String item){
        if ("buckler".equals(item)) {
            bucklerPoints = 3;
        }
        return this;
    }

}
