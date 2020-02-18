package me.guillaume.tournament;

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
            if(this.weapon instanceof TwoHandWeapon) this.weapon = null;
        }
        return this;
    }

    public void engage(Fighter other) {
        new Fight(this, other);
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
