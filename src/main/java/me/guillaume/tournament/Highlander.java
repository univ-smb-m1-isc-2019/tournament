package me.guillaume.tournament;

import java.nio.file.Watchable;

public class Highlander extends Champion {


    public Highlander() {
        super.name = "Highlander";
        super.hp = 150;
        this.weapon = new Weapon("GreatSword", 12);
    }

    public int hitPoints() {
        return this.hp;
    }

    public Highlander equip(String buckler) {
        return null;
    }
}
