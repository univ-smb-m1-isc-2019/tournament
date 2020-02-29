package me.guillaume.tournament;

import me.guillaume.tournament.equipement.defense.Defense;
import me.guillaume.tournament.equipement.Equipment;
import me.guillaume.tournament.equipement.EquipmentFactory;
import me.guillaume.tournament.equipement.weapon.Weapon;
import me.guillaume.tournament.skill.SkillFactory;

public class Swordsman extends Fighter{

    private static final int MAX_HIT_POINTS = 100;
    private static final String DEFAULT_WEAPON = "sword";

    public Swordsman(){
        super(MAX_HIT_POINTS);
        equip(DEFAULT_WEAPON);
    }

    public Swordsman(String skill){
        super(MAX_HIT_POINTS);
        equip(DEFAULT_WEAPON);

        this.skill = new SkillFactory().getSkill(skill);
    }

    public Swordsman equip(String equipmentName){
        Equipment equipment = new EquipmentFactory().getEquipment(equipmentName);

        if(equipment instanceof Weapon) weapon = (Weapon) equipment;
        else defenseEquipment.add((Defense) equipment);

        return this;
    }
}
