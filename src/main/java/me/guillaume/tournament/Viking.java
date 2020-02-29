package me.guillaume.tournament;

public class Viking extends Fighter{

    private static final int HIT_POINTS = 120;
    private static final String DEFAULT_WEAPON = "one_hand_axe";

    public Viking(){
        super(HIT_POINTS);
        equip(DEFAULT_WEAPON);
    }

    public Viking(String skill){
        super(HIT_POINTS);
        equip(DEFAULT_WEAPON);

        this.skill = new SkillFactory().getSkill(skill);
    }

    public Viking equip(String equipmentName){
        Equipment e = new EquipmentFactory().getEquipment(equipmentName);

        if(e instanceof Weapon) weapon = (Weapon) e;
        else defenseEquipment.add((Defense) e);

        return this;
    }

}
