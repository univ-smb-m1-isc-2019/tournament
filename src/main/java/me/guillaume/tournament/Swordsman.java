package me.guillaume.tournament;

public class Swordsman extends Champion {


    public Swordsman() {
        super.name = "Swordsman";
        super.hp = 100;
        this.weapon = new Weapon("sword", 5);

    }

    public int hitPoints() {
        return this.hp;
    }

    public Swordsman equip(String buckler) {
        if (buckler.equals("buckler")) {
            this.bouclier = new Bouclier();
        }
        if(buckler.equals("armor")){
            this.armor = new Armor();
        }
        return this;
    }
}
