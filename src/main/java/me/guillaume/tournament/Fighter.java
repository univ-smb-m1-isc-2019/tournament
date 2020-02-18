package me.guillaume.tournament;

public abstract class Fighter {
    protected int hitPoints;
    protected int damagePoints;
    protected int armorPoints;
    protected int bucklerPoints;
    protected boolean axe;

    public Fighter(int hitPoints, int damagePoints, int armorPoints, int bucklerPoints, boolean axe) {
        this.hitPoints = hitPoints;
        this.damagePoints = damagePoints;
        this.armorPoints = armorPoints;
        this.bucklerPoints = bucklerPoints;
        this.axe = axe;
    }

    boolean isAlive(){
        return hitPoints > 0;
    }

    void attack(Fighter fighter){
        fighter.hitPoints -= damagePoints - fighter.armorPoints;
    }

    void fight(Fighter fighter, boolean oneTurnOutOfTwo){
        if(fighter.bucklerPoints > 0){
            if(oneTurnOutOfTwo){
                attack(fighter);
                if(axe) fighter.bucklerPoints--;
            }
        } else {
            attack(fighter);
        }
    }

    void fightTurn(Fighter fighter, boolean oneTurnOutOfTwo){
        fight(fighter, oneTurnOutOfTwo);
        fighter.fight(this, oneTurnOutOfTwo);

    }

    void engage(Fighter fighter){
        boolean oneTurnOutOfTwo = true;
        while( isAlive() && fighter.isAlive() ){
            fightTurn(fighter, oneTurnOutOfTwo);
            oneTurnOutOfTwo = !oneTurnOutOfTwo;
        }
    }

}
