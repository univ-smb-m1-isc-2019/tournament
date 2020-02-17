package me.guillaume.tournament;

public class Highlander extends Fighter{

    private final static int HIT_POINTS = 150;


    public Highlander(){
        super(HIT_POINTS);
    }

    public Highlander(String type){
        super(HIT_POINTS);

    }

    public Highlander equip(String equipmentName){
        Equipment e = new EquipmentFactory().getEquipment(equipmentName);

        if(e instanceof Weapon) weapon = (Weapon) e;
        else defenseEquipment.add((Defense) e);

        return this;
    }
}
