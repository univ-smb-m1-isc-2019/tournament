package me.arnaud.fighters;

import me.arnaud.equipments.weapons.GreatSword;
import me.arnaud.equipments.weapons.WeaponAbstract;

public class Highlander extends FighterAbstract {
    public Highlander() {
        super(new GreatSword(), 150);
    }
}
