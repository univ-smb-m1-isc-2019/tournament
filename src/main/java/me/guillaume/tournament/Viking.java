package me.guillaume.tournament;

import me.guillaume.tournament.equipement.defense.Defense;
import me.guillaume.tournament.equipement.Equipment;
import me.guillaume.tournament.equipement.EquipmentFactory;
import me.guillaume.tournament.equipement.weapon.Weapon;
import me.guillaume.tournament.skill.SkillFactory;

public class Viking extends Fighter{

    private static final int MAX_HIT_POINTS = 120;
    private static final String DEFAULT_WEAPON = "axe";

    public Viking(){
        super(MAX_HIT_POINTS);
        equip(DEFAULT_WEAPON);
    }

    public Viking(String skill){
        super(MAX_HIT_POINTS);
        equip(DEFAULT_WEAPON);

        this.skill = new SkillFactory().getSkill(skill);
    }

    public Viking equip(String equipmentName){
        Equipment equipment = new EquipmentFactory().getEquipment(equipmentName);

        if(equipment instanceof Weapon) weapon = (Weapon) equipment;
        else defenseEquipment.add((Defense) equipment);

        return this;
    }

}
