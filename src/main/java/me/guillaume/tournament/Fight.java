package me.guillaume.tournament;

public class Fight {
    public Fight(Fighter fighter1, Fighter fighter2) {
        startFight(fighter1, fighter2);
    }

    private void startFight(Fighter f1, Fighter f2) {
        int turn = 0;

        while (f1.hitPoints() > 0 && f2.hitPoints() > 0) {
            if (turn == 0) {
                f1.hit(f2);
            } else {
                f2.hit(f1);
            }
            turn = (turn + 1) % 2;
        }
    }
}
