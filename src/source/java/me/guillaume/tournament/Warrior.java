package me.guillaume.tournament;

public abstract class Warrior {
    public int hitPoints;
    public Weapon weapon;

    public abstract void engage(Warrior warrior);
}
