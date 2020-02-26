package me.guillaume.tournament;

public class Equipment {
    protected String typeEquipement;
    protected boolean equipAttack;
    protected int damage;


    public Equipment(String typeEquipement){
        this.typeEquipement = typeEquipement;
    }

    public String getTypeEquipement() {
        return typeEquipement;
    }

    public boolean isEquipAttack() {
        return equipAttack;
    }

    public int getDamage() {
        return damage;
    }
}
