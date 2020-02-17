package me.guillaume.tournament;

public class Viking extends Fighter{

    private final static int HIT_POINTS = 120;


    public Viking(){
        super(HIT_POINTS);
        equip("one_hand_axe");

    }

    public Viking(String type){
        super(HIT_POINTS);

    }

    public Viking equip(String equipmentName){
        Equipment e = new EquipmentFactory().getEquipment(equipmentName);

        if(e instanceof Weapon) weapon = (Weapon) e;
        else defenseEquipment.add((Defense) e);

        return this;
    }

}
