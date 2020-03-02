package me.guillaume.tournament;

public class Fight {

    private final Swordsman swordsman;
    private final Viking viking;

    public Fight(Swordsman swordsman, Viking viking) {

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
