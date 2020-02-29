package me.guillaume.tournament.skill;

import me.guillaume.tournament.Fighter;

public abstract class Skill {

    public abstract int damageModifier(int attackPower, Fighter fighter);
}
