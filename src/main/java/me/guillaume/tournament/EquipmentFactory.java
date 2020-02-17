package me.guillaume.tournament;

import java.util.HashMap;

public class EquipmentFactory {

    private HashMap<String, Equipment> equipmentInstances;

    // Weapons
    private static final String ONE_HAND_SWORD = "one_hand_sword";
    private static final String ONE_HAND_AXE = "one_hand_axe";
    private static final String GREAT_SWORD = "great_sword";

    // Defense
    private static final String ARMOR = "armor";
    private static final String BUCKLER = "buckler";

    public EquipmentFactory(){
        equipmentInstances = new HashMap<>();

        equipmentInstances.put(ONE_HAND_SWORD, new OneHandSword());
        equipmentInstances.put(ONE_HAND_AXE, new OneHandAxe());
        equipmentInstances.put(GREAT_SWORD, new GreatSword());

        equipmentInstances.put(ARMOR, new Armor());
        equipmentInstances.put(BUCKLER, new Buckler());
    }

    public Equipment getEquipment(String equipment){
        return equipmentInstances.get(equipment);
    }

}
