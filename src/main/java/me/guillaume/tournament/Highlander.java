package me.guillaume.tournament;

public class Highlander extends Champion{


    public Highlander(String name) {
        super(name);
    }

    public Highlander() {
        super.name = "Viking";
    }

    public boolean hitPoints() {
        return false;
    }

    public Highlander equip(String buckler) {

        return this;
    }
}
