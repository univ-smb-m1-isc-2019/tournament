package me.guillaume.tournament;
import java.util.ArrayList;

public class Warrior {
    protected int healthPoints, dmg;
    protected String typeWarrior;
    protected ArrayList<String> equipment;

    public Warrior(){}

    public Warrior(String typeWarrior){
        this.typeWarrior = typeWarrior;
    }

    protected void engage(Warrior mWarrior){

        int comptonOffBuckler = 0;
        int comptonOffBucklerThis = 0;

        while (mWarrior.healthPoints != 0 && this.healthPoints != 0){


                if (mWarrior.healthPoints - this.dmg >= 0)
                    mWarrior.healthPoints -= this.dmg;
                else
                    mWarrior.healthPoints -= mWarrior.healthPoints;

                if (this.healthPoints - mWarrior.dmg >= 0)
                    this.healthPoints -= mWarrior.dmg;
                else
                    this.healthPoints -= this.healthPoints;


        }
    }

    private boolean haveBuckler(Warrior mWarrior){
        return mWarrior.equipment.contains("buckler");
    }

    private void actionWarriorWithBuckler(Warrior mWarrior){

    }


    public int hitPoints() {
        return this.healthPoints;
    }


}
