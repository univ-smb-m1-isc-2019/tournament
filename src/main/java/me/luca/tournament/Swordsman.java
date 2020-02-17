package me.luca.tournament;

public class Swordsman extends Heroes {
    public Swordsman(String name) {
        super(name);
        super.pv = 100;
        super.rightHand = new offEquipment("hand sword",5);

    }

    public Swordsman() {
        super.name = "Swordsman";
        super.pv = 100;
        super.rightHand = new offEquipment("hand sword",5);

    }

    public Swordsman equip(String buckler) {

        return this;
    }
}
