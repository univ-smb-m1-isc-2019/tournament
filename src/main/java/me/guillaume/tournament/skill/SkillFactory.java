package me.guillaume.tournament.skill;

import java.util.HashMap;

public class SkillFactory {

    private HashMap<String, Skill> skillInstances;

    private static final String VICIOUS = "Vicious";
    private static final String VETERAN = "Veteran";

    public SkillFactory(){
        skillInstances = new HashMap<>();

        skillInstances.put(VICIOUS, new Vicious());
        skillInstances.put(VETERAN, new Veteran());
    }

    public Skill getSkill(String skill){
        return skillInstances.get(skill);
    }
}
