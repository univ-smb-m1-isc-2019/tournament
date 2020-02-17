package me.arnaud.fighters;

import me.arnaud.fighters.FighterAbstract;
import me.arnaud.weapons.OneHandAxe;
import me.arnaud.weapons.WeaponAbstract;

public class Viking extends FighterAbstract {
    public Viking() {
        super(new OneHandAxe(), 120);
    }


}
