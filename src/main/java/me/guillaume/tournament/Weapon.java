package me.guillaume.tournament;

public class Weapon extends Equipment {
    protected int damage;

    public Weapon(String typeEquipement) {
        super(typeEquipement);
    }

    public int getDamage() {
        return damage;
    }
}
