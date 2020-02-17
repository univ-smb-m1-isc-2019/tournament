package me.guillaume.tournament;

public class Swordsman extends Fighter{

    private final static int HIT_POINTS = 100;

    public Swordsman(){
        super(HIT_POINTS);
        equip("one_hand_sword");
    }

    public Swordsman(String type){
        super(HIT_POINTS);

    }

    public Swordsman equip(String equipmentName){
        Equipment e = new EquipmentFactory().getEquipment(equipmentName);

        if(e instanceof Weapon) weapon = (Weapon) e;
        else defenseEquipment.add((Defense) e);

        return this;
    }
}
