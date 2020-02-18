package me.guillaume.tournament.fighters;

import me.guillaume.tournament.fighters.bucklers.Buckler;
import me.guillaume.tournament.fighters.weapons.TwoHandWeapon;
import me.guillaume.tournament.fighters.weapons.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Fighter {
    protected int hp;
    protected int dmg;
    protected Weapon weapon;
    protected Buckler buckler;

    public Fighter() {
    }

    public Fighter(String state) {
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        setDmg(weapon.getDmg());
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void throwWeapon() {
        this.weapon = null;
    }

    public boolean hasBuckler() {
        return this.buckler != null;
    }

    public void throwUselessBuckler() {
        this.buckler = null;
    }

    public int getDmg() {
        return dmg;
    }

    protected void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int hitPoints() {
        return hp;
    }

    public Fighter equip(String portable) {
        if(portable.equals("buckler")) {
            this.buckler = new Buckler();
            if(this.weapon instanceof TwoHandWeapon) throwWeapon();
        }
        return this;
    }

    public void engage(Fighter other) {
        new Fight(new ArrayList<>(Arrays.asList(this, other)));
    }

    public void hit(Fighter other) {
        other.getHitBy(this);
    }

    protected void getHitBy(Fighter other) {
        int dmgToBeGiven = other.getDmg();
        if(hasBuckler()) {
            dmgToBeGiven = this.buckler.protectAgainst(other);
            if(this.buckler.hasToBeDestroy()) throwUselessBuckler();
        }
        setHp(Math.max(0, hitPoints() - dmgToBeGiven));
    }
}
