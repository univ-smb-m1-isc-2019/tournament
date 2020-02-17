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
        new Fight(this, other);
    }
}
