package me.guillaume.tournament;

public class Swordsman extends Fighter {
    private static final int HIT_POINTS = 100;
    private static final int DAMAGE_POINTS = 5;
    private static final int ARMOR_POINTS = 0;
    private static final int BUCKLER_POINTS = 0;
    private static final boolean AXE = false;

    public Swordsman() {
        super(HIT_POINTS, DAMAGE_POINTS, ARMOR_POINTS, BUCKLER_POINTS, AXE);
    }

    public Swordsman(String type) {
        super(HIT_POINTS, DAMAGE_POINTS, ARMOR_POINTS, BUCKLER_POINTS, AXE);
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

    Swordsman equip(String item){
        if ("buckler".equals(item)) {
            bucklerPoints = 3;
        }
        if ("armor".equals(item)) {
            armorPoints = 3;
            damagePoints--;
        }
        return this;
    }

}
