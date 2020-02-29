package me.guillaume.tournament;

public class Swordsman extends Fighter {
    private static final int HIT_POINTS = 100;
    private static final int DAMAGE_POINTS = 5;
    private static final int ARMOR_POINTS = 0;
    private static final int BUCKLER_POINTS = 0;
    private static final boolean AXE = false;
    private int poisonPoints = 0;

    public Swordsman() {
        super(HIT_POINTS, DAMAGE_POINTS, ARMOR_POINTS, BUCKLER_POINTS, AXE);
    }

    public Swordsman(String type) {
        super(HIT_POINTS, DAMAGE_POINTS, ARMOR_POINTS, BUCKLER_POINTS, AXE);
        if ("Vicious".equals(type)) poisonPoints = 2;
    }

    int hitPoints(){
        return Math.max(hitPoints, 0);
    }

    Swordsman equip(String item){
        if ("buckler".equals(item)) bucklerPoints = 3;
        if ("armor".equals(item)) {
            armorPoints = 3;
            damagePoints--;
        }
        if ("axe".equals(item)) {
            axe = true;
            damagePoints++;
        }
        return this;
    }

    @Override
    void fight(Fighter fighter, boolean oneTurnOutOfTwo) {
        super.fight(fighter, oneTurnOutOfTwo);
        if (poisonPoints > 0 ) {
            fighter.hitPoints -= 20;
            poisonPoints--;
        }
    }
}
