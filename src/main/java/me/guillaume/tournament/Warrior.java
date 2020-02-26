package me.guillaume.tournament;
import java.util.ArrayList;

public class Warrior {
    protected int healthPoints;
    protected String typeWarrior;
    protected ArrayList<Equipment> equipment;

    public Warrior(){}

    public Warrior(int healthPoints, String typeWarrior){
        this.healthPoints = healthPoints;
        this.typeWarrior = typeWarrior;
    }

    protected void engage(Warrior mWarrior){

        while (mWarrior.healthPoints != 0 && this.healthPoints != 0){
            attack(mWarrior, equipment.get(0).getDamage());
            attack(this,mWarrior.equipment.get(0).getDamage());
        }
    }

    private void attack(Warrior mWarrior, int attackDmg ){
        if (mWarrior.healthPoints - attackDmg >= 0)
            mWarrior.healthPoints -= attackDmg;
        else
            mWarrior.healthPoints = 0;
    }

    protected Equipment createdEquipementItem(String typeOfItem){
        switch (typeOfItem){
            case "buckler":
                return new Buckler(typeOfItem);

            case "armor":
                return new Armor(typeOfItem);

            case "axe":
                return new Axe(typeOfItem);

            case "sword":
                return  new Sword(typeOfItem);

            case "Great Sword":
                return new GreatSword(typeOfItem);

            default:
                System.out.println("'createdEquipementItem()': equipment does not exist");
        }

        return null;
    }



    public int hitPoints() {
        return this.healthPoints;
    }


}
