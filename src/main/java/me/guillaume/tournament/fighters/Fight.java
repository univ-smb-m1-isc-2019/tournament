package me.guillaume.tournament.fighters;

import java.util.ArrayList;

public class Fight {
    private ArrayList<Fighter> fighters;
    private int turn = 0;

    public Fight(ArrayList<Fighter> fighters) {
        this.fighters = fighters;
        startFight();
    }

    private void startFight() {
        Fighter actual;

        while (!oneFighterIsKilled()) {
            actual = getActualFighter();
            actual.hit(getNextFighter());
            turn++;
        }
    }

    private boolean oneFighterIsKilled() {
        for(Fighter fighter : this.fighters)
            if(fighter.hitPoints() <= 0) return true;
        return false;
    }

    private Fighter getActualFighter() {
        return fighters.get(turn % fighters.size());
    }

    private Fighter getNextFighter() {
        return fighters.get((turn + 1) % fighters.size());
    }
}
