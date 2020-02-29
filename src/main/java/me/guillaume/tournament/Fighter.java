package me.guillaume.tournament;

import java.util.ArrayList;

public abstract class Fighter {

    private int hitPoints;
    private Skill skill;

    private int fatigue;
    protected Weapon weapon;
    protected ArrayList<Defense> defenseEquipment;


    public Fighter(int hitPoints){
        this.hitPoints = hitPoints;
        this.fatigue = 0;
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
        if(this.canAttack()) {
            int attackerAttackPower = this.getAttackPower();

            otherFighter.takeAHit(attackerAttackPower, this.weapon);
        }
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

        if(damageTaken < 0) damageTaken = 0;

        hitPoints -= damageTaken;

        if(hitPoints < 0) hitPoints = 0;
    }

    private boolean canAttack(){
        int attackSpeed = weapon.getAttackSpeed();

        // If the attackSpeed is 0, the fighter can attack every turn
        if(attackSpeed == 0) return true;

        if(attackSpeed != fatigue){
            fatigue++;
            return true;
        }

        fatigue = 0;
        return false;
    }

    public int hitPoints(){
        return hitPoints;
    }

    public abstract Fighter equip(String equipment);
}
