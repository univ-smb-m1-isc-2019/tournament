package me.guillaume.tournament;
import java.util.ArrayList;

public class Warrior {
    protected int healthPoints;

    protected String typeWarrior;
    protected Weapon myWeapon1, myWeapon2 = null;
    protected Buckler myBuckler = null;
    protected Armor myArmor = null;
    protected ArrayList<Equipment> equipment;


    public Warrior(){}

    public Warrior(int healthPoints, String typeWarrior){
        this.healthPoints = healthPoints;
        this.typeWarrior = typeWarrior;
    }

    protected void engage(Warrior mWarrior){

        while (mWarrior.healthPoints != 0 && this.healthPoints != 0){
            action(mWarrior, myWeapon1);
            action(this,mWarrior.myWeapon1);
        }
    }

    private void action(Warrior mWarriorReceiver, Equipment wpAttack ){

        if(mWarriorReceiver.myBuckler == null)
            attack(mWarriorReceiver,wpAttack);
        else{

            if(!mWarriorReceiver.myBuckler.isProtectionIsActive())
                attack(mWarriorReceiver,wpAttack);

            mWarriorReceiver.myBuckler.getDmgfromAttack(wpAttack);
        }
    }

    private void attack(Warrior mWarrior, Equipment wpAttack ){
        if (mWarrior.healthPoints - wpAttack.getDamage() >= 0)
            mWarrior.healthPoints -= wpAttack.getDamage();
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


    protected void equipping(){
        for(int i = 0; i < equipment.size(); i++)
            setItems(equipment.get(i));
    }

    private void setItems(Equipment myItem){
        switch (myItem.getTypeEquipement()){
            case "buckler":
                myBuckler = (Buckler) myItem;
                break;

            case "armor":
                myArmor = (Armor) myItem;

            default:
                if (myWeapon1 == null)
                    myWeapon1 = (Weapon) myItem;
                else
                    myWeapon2 = (Weapon) myItem;
        }
    }



    public int hitPoints() {
        return this.healthPoints;
    }


}
