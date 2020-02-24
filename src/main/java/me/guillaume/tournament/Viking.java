package me.guillaume.tournament;

public class Viking extends Champion {


    public Viking() {
        super.name = "Viking";
        super.hp = 120;
        this.weapon = new Weapon("axe", 6);
    }

    public int hitPoints() {
        return this.hp;
    }

    public Viking equip(String buckler) {
        if (buckler.equals("buckler")) {
            this.bouclier = new Bouclier();
        }
        return this;
    }

}
