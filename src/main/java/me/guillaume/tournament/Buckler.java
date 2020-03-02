package me.guillaume.tournament;

public class Buckler {

    private boolean blocked;
    private int axeBlocked;

    public Buckler() {
        blocked = false;
    }

    public boolean canBlock(Weapon weapon) {

        if (axeBlocked >= 3) {
            return false;
        }

        blocked = !blocked;

        if (weapon instanceof Axe) {
            if (blocked) {
                axeBlocked++;
            }
        }

        return blocked;
    }

}
