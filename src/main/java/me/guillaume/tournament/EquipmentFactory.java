package me.guillaume.tournament;

import java.util.HashMap;

public class EquipmentFactory {

    private HashMap<String, Equipment> equipmentInstances;

    private static final String BUCKLER = "buckler";
    private static final String ONE_HAND_SWORD = "one_hand_sword";
    private static final String ONE_HAND_AXE = "one_hand_axe";


    public EquipmentFactory(){
        equipmentInstances = new HashMap<>();

        equipmentInstances.put(BUCKLER, new Buckler());
        equipmentInstances.put(ONE_HAND_SWORD, new OneHandSword());
        equipmentInstances.put(ONE_HAND_AXE, new OneHandAxe());
    }

    public Equipment getEquipment(String equipment){
        return equipmentInstances.get(equipment);
    }

}
