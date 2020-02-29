package me.guillaume.tournament;

import me.guillaume.tournament.equipement.defense.Defense;
import me.guillaume.tournament.equipement.Equipment;
import me.guillaume.tournament.equipement.EquipmentFactory;
import me.guillaume.tournament.equipement.weapon.Weapon;
import me.guillaume.tournament.skill.SkillFactory;

public class Highlander extends Fighter{

    private static final int MAX_HIT_POINTS = 150;
    private static final String DEFAULT_WEAPON = "great_sword";

    public Highlander(){
        super(MAX_HIT_POINTS);
        equip(DEFAULT_WEAPON);
    }

    public Highlander(String skill){
        super(MAX_HIT_POINTS);
        equip(DEFAULT_WEAPON);

        this.skill = new SkillFactory().getSkill(skill);
    }

    public Highlander equip(String equipmentName){
        Equipment equipment = new EquipmentFactory().getEquipment(equipmentName);

        if(equipment instanceof Weapon) weapon = (Weapon) equipment;
        else defenseEquipment.add((Defense) equipment);

        return this;
    }
}
