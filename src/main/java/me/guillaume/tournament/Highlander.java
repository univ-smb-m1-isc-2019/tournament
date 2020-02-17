package me.guillaume.tournament;

public class Highlander extends Champion{


    public Highlander(String name) {
        super(name);
    }

    public Highlander() {
        super.name = "Highlander";
        super.hp = 150;
    }

    public int hitPoints() {
        return this.hp;
    }

    public Highlander equip(String buckler) {

        return this;
    }
}
