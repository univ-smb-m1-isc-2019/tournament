package me.arnaud.fighters;

import me.arnaud.weapons.OneHandSword;
import me.arnaud.weapons.WeaponAbstract;

public class Swordsman extends FighterAbstract {

    public Swordsman() {
        super(new OneHandSword(), 100);

    }


}
