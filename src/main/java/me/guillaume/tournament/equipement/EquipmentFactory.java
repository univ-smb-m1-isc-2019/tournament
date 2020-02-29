package me.guillaume.tournament.equipement;

import me.guillaume.tournament.equipement.defense.Armor;
import me.guillaume.tournament.equipement.defense.Buckler;
import me.guillaume.tournament.equipement.weapon.GreatSword;
import me.guillaume.tournament.equipement.weapon.OneHandAxe;
import me.guillaume.tournament.equipement.weapon.OneHandSword;

import java.util.HashMap;

public class EquipmentFactory {

    private HashMap<String, Equipment> equipmentInstances;

    // Weapon
    private static final String ONE_HAND_SWORD = "sword";
    private static final String ONE_HAND_AXE = "axe";
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
