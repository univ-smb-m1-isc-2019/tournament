package me.guillaume.tournament;

public class Buckler extends Portable {
    private boolean activeProtection = true;
    private int durability = 3;

    public Buckler() {
        super();
    }

    public boolean isActiveProtection() {
        return activeProtection;
    }

    // called when a fighter, owner of a buckler, receives a blow.
    // returns the quantity of taken dmg after the buckler protection.
    public int protectAgainst(Fighter other) {
        int takenDmg = other.getDmg();

        if(activeProtection) {
            if(other.getWeapon() instanceof OneHandAxe) durability--;
            takenDmg = 0;
        }
        updateProtectionState();

        return takenDmg;
    }

    private void updateProtectionState() {
        activeProtection = !activeProtection;
    }

    public boolean hasToBeDestroy() {
        return durability == 0;
    }
}
