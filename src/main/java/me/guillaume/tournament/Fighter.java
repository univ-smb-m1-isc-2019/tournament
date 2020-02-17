package me.guillaume.tournament;

public abstract class Fighter {

    private int hitPoints;
    private Weapon weapon;

    public Fighter(int hitPoints, Weapon weapon){
        this.hitPoints = hitPoints;
        this.weapon = weapon;
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

        otherFighter.takeAHit(attackerAttackPower);
    }

    private int getAttackPower(){
        return weapon.getPower();
    }

    private void takeAHit(int damageTaken){
        hitPoints -= damageTaken;

        if(hitPoints < 0) hitPoints = 0;
    }

    public int hitPoints(){
        return hitPoints;
    }

    public abstract Fighter equip(String equipment);
}
