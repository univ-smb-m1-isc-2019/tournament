package me.guillaume.tournament;

public class Viking extends Champion {

    public Viking(String name) {
        super(name);
    }

    public Viking() {
        super.name = "Viking";
        super.hp = 120;
        this.weapon = new Weapon("axe",6,1);
    }

    public int hitPoints() {
        return this.hp;
    }

    public Viking equip(String buckler) {

        return this;
    }
}
