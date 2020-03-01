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
            warriorReceiverWithBuckler(mWarrior, this);
            if (mWarrior.healthPoints != 0)
                warriorReceiverWithBuckler(this,mWarrior);
        }
    }

    private void warriorReceiverWithBuckler(Warrior warriorReceiver, Warrior warriorAttack ){

        if(warriorReceiver.myBuckler != null){

            if(warriorReceiver.myBuckler.protectionIsActive())
                greatSwordAttack(warriorAttack.myWeapon1);
            else
                warriorAttackerWithArmor(warriorReceiver,warriorAttack);

            warriorReceiver.myBuckler.getDmgfromAttack(warriorAttack.myWeapon1); //check if warrior attack with 'Axe' and switch protection.

        }else
            warriorAttackerWithArmor(warriorReceiver,warriorAttack);
    }

    private void warriorAttackerWithArmor(Warrior warriorReceiver, Warrior warriorAttack ){
        int weaponDamageAttack = getWeaponDamageAttack(warriorAttack.myWeapon1);

        if (warriorAttack.myArmor != null) {
            int deliveredDamage = warriorAttack.myArmor.attackWithArmor(weaponDamageAttack);
            warriorReceiverWithArmor(warriorReceiver,warriorAttack,deliveredDamage);
        }else{
            warriorReceiverWithArmor(warriorReceiver,warriorAttack,weaponDamageAttack);
        }
    }

    private void warriorReceiverWithArmor(Warrior warriorReceiver, Warrior warriorAttack, int damage) {
        if(warriorReceiver.myArmor != null){
            int receivedDamage = warriorReceiver.myArmor.protectionFromAttack(damage);
            calculateDamage(warriorReceiver, receivedDamage);
        }else
            calculateDamage(warriorReceiver, damage);
    }

    private void calculateDamage (Warrior mWarrior,int damage){
        if (mWarrior.healthPoints - damage > 0)
            mWarrior.healthPoints -= damage;
        else
            mWarrior.healthPoints = 0;
    }


    private int getWeaponDamageAttack(Weapon weaponAttack){
        greatSwordAttack(weaponAttack);
        return weaponAttack.getDamage();
    }

    private void greatSwordAttack(Weapon weaponAttack){
        if (weaponAttack.typeEquipement.equals("Great Sword")){
            GreatSword myGreatSword = (GreatSword) weaponAttack;
            myGreatSword.attackGreatSword();
        }
    }

    protected Equipment createdEquipmentItem(String typeOfItem){
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
                break;

            default:
                if (myWeapon1 == null)
                    myWeapon1 = (Weapon) myItem;
                else
                    myWeapon2 = (Weapon) myItem;
                break;
        }
    }



    public int hitPoints() {
        return this.healthPoints;
    }


}
