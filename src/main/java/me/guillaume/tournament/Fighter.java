package me.guillaume.tournament;

import java.util.ArrayList;

public abstract class Fighter {

    private int hitPoints;
    protected Weapon weapon;
    protected ArrayList<Defense> defenseEquipment;

    public Fighter(int hitPoints){
        this.hitPoints = hitPoints;
        this.defenseEquipment = new ArrayList<>();
    }

    public void engage(Fighter otherFighter){
        while(!isDead()){
            this.attack(otherFighter);

            if(otherFighter.isDead()) break;

            otherFighter.attack(this);
        }
    }


    private boolean isDead(){
        return hitPoints <= 0;
    }

    private void attack(Fighter otherFighter){
        int attackerAttackPower = this.getAttackPower();

        otherFighter.takeAHit(attackerAttackPower, this.weapon);
    }

    private int getAttackPower(){
        int attackPower = weapon.getPower();

        for(Defense equipment: defenseEquipment){
            attackPower = equipment.damageModifier(attackPower);
        }

        return attackPower;
    }

    private void takeAHit(int damageTaken, Weapon attackerWeapon){
        for(Defense equipment: defenseEquipment) {
            damageTaken = equipment.defenseModifier(damageTaken, attackerWeapon);
        }

        hitPoints -= damageTaken;

        if(hitPoints < 0) hitPoints = 0;
    }

    public int hitPoints(){
        return hitPoints;
    }

    public abstract Fighter equip(String equipment);
}
