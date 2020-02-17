package me.luca.tournament;

public class Highlander extends Heroes {
    public Highlander(String name) {
        super(name);
        super.pv =150;
        super.rightHand = new offEquipment("great sword",12);
    }

    public Highlander() {
        super.name = "Highlander";
        super.pv =150;
        super.rightHand = new offEquipment("great sword",12,2);

    }

    public Highlander equip(String buckler) {

        return this;
    }
}
