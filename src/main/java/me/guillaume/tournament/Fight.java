package me.guillaume.tournament;

public class Fight {

    private final Fighter swordsman;
    private final Fighter viking;

    public Fight(Fighter swordsman, Fighter viking) {

        this.swordsman = swordsman;
        this.viking = viking;
    }

    public void run() {
        while (true) {

            swordsman.hit(viking);
            if (viking.isDead()) {
                break;
            }

            viking.hit(swordsman);
            if (swordsman.isDead()) {
                break;
            }
        }

    }
}
