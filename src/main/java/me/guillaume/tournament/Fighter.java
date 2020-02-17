package me.guillaume.tournament;

import java.util.ArrayList;

public abstract class Fighter {
    private int hp;

    public Fighter() {
    }

    public Fighter(String state) {
    }

    public int hitPoints() {
        return hp;
    }

    public Fighter equip(String portable) {
        return this;
    }

    public void engage(Fighter other) {
        ArrayList<Fighter> fighters = new ArrayList<>();
        fighters.add(this);
        fighters.add(other);

        Fight fight = new Fight(fighters);
    }
}
