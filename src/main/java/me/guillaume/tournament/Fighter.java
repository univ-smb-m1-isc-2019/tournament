package me.guillaume.tournament;

import me.guillaume.tournament.equipement.defense.Defense;
import me.guillaume.tournament.equipement.weapon.Weapon;
import me.guillaume.tournament.skill.Skill;

import java.util.ArrayList;

public abstract class Fighter {

    private int maxHitPoints;
    private int hitPoints;

    // Fatigue build up when a weapon is heavy and have an attack speed superior than 0
    private int fatigue;

    protected Weapon weapon;
    protected ArrayList<Defense> defenseEquipment;
    protected Skill skill;

    public Fighter(int maxHitPoints){
        this.maxHitPoints = maxHitPoints;
        this.hitPoints = maxHitPoints;
        this.fatigue = 0;
        this.defenseEquipment = new ArrayList<>();
        this.skill = null;
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


    /////////////////////////////////////////////////////////////////
    /// Dealing Damage
    /////////////////////////////////////////////////////////////////

    private void attack(Fighter otherFighter){
        if(this.canAttack()) {
            int attackerAttackPower = this.getAttackPower();

            otherFighter.takeAHit(attackerAttackPower, this.weapon);
        }
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

    private int getAttackPower(){
        int attackPower = weapon.getPower();
        attackPower = getEquipementDamageModifier(attackPower);
        attackPower = getSkillDamageModifier(attackPower);

        return attackPower;
    }

    private int getEquipementDamageModifier(int attackPower){
        for(Defense equipment: defenseEquipment){
            attackPower = equipment.damageModifier(attackPower);
        }
        return attackPower;
    }

    private int getSkillDamageModifier(int attackPower){
        if(skill != null){
            attackPower = skill.damageModifier(attackPower, this);
        }

        return attackPower;
    }


    /////////////////////////////////////////////////////////////////
    /// Taking Damage
    /////////////////////////////////////////////////////////////////

    private void takeAHit(int damageTaken, Weapon attackerWeapon){
        for(Defense equipment: defenseEquipment) {
            damageTaken = equipment.defenseModifier(damageTaken, attackerWeapon);
        }

        if(damageTaken < 0) damageTaken = 0;

        hitPoints -= damageTaken;

        if(hitPoints < 0) hitPoints = 0;
    }


    public int hitPoints(){
        return hitPoints;
    }
    public int maxHitPoints(){ return maxHitPoints; }

    public abstract Fighter equip(String equipment);
}
