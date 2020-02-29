package me.guillaume.tournament;

public class Highlander extends Fighter{

    private static final int HIT_POINTS = 150;
    private static final String DEFAULT_WEAPON = "great_sword";

    public Highlander(){
        super(HIT_POINTS);
        equip(DEFAULT_WEAPON);
    }

    public Highlander(String skill){
        super(HIT_POINTS);
        equip(DEFAULT_WEAPON);

        this.skill = new SkillFactory().getSkill(skill);
    }

    public Highlander equip(String equipmentName){
        Equipment e = new EquipmentFactory().getEquipment(equipmentName);

        if(e instanceof Weapon) weapon = (Weapon) e;
        else defenseEquipment.add((Defense) e);

        return this;
    }
}
