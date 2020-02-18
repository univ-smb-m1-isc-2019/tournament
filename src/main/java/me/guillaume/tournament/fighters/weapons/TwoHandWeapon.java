package me.guillaume.tournament.fighters.weapons;

public abstract class TwoHandWeapon extends Weapon {
    private int countBlows = 0;

    public TwoHandWeapon() {
        super();
    }

    @Override
    public boolean canGiveABlow() {
        return countBlows % 3 == 2;
    }

    @Override
    public void giveABlow() {
        countBlows++;
    }
}
