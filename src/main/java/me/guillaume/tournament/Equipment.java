package me.guillaume.tournament;

public class  Equipment {
    protected String typeEquipement;
    protected int damage;


    public Equipment(String typeEquipement){
        this.typeEquipement = typeEquipement;
    }

    public String getTypeEquipement() {
        return typeEquipement;
    }

    public int getDamage() {
        return damage;
    }

}
