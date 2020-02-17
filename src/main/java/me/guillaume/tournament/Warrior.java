package me.guillaume.tournament;
import java.util.ArrayList;

public class Warrior {
    protected int hitPoints, dmg;
    protected String typeWarrior;
    protected ArrayList<String> equipment = new ArrayList<>();

    public Warrior(){}

    public Warrior(String typeWarrior){
        this.typeWarrior = typeWarrior;
    }

    protected void engage(Warrior mWarrion){
    }


    public int hitPoints() {
        return this.hitPoints;
    }


}
