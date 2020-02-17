package me.guillaume.tournament;

public abstract class Fighter {
    int hitPoints = 100;
    int damagePoints = 5;

    public Fighter() {
    }

    boolean isAlive(){
        return hitPoints > 0;
    }

    void attack(Fighter fighter){
        fighter.hitPoints = fighter.hitPoints - this.damagePoints;
    }

    void fightTurn(Fighter fighter){
        attack(fighter);
        fighter.attack(this);
    }

    void engage(Fighter fighter){
        while( isAlive() && fighter.isAlive() ){
            fightTurn(fighter);
        }
    }

}
