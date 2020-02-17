package me.guillaume.tournament;

public class Swordsman extends Champion{

    public Swordsman(String name) {
        super(name);
    }

    public Swordsman() {
        super.name = "Swordsman";
        super.hp = 100;
        this.weapon = new Weapon("sword",5,1);
    }

    public int hitPoints() {
        return this.hp;
    }

    public Swordsman equip(String buckler) {

        return this;
    }
}
