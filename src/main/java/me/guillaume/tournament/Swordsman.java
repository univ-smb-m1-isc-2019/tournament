package me.guillaume.tournament;

public class Swordsman extends Fighter{

    private final static int HIT_POINTS = 100;
    private static final String DEFAULT_WEAPON = "one_hand_sword";

    public Swordsman(){
        super(HIT_POINTS);
        equip(DEFAULT_WEAPON);
    }

    public Swordsman(String skill){
        super(HIT_POINTS);
        equip(DEFAULT_WEAPON);

        this.skill = new SkillFactory().getSkill(skill);
    }

    public Swordsman equip(String equipmentName){
        Equipment e = new EquipmentFactory().getEquipment(equipmentName);

        if(e instanceof Weapon) weapon = (Weapon) e;
        else defenseEquipment.add((Defense) e);

        return this;
    }
}
