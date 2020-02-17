package me.arnaud.equipments.weapons;

public abstract class WeaponAbstract {
    protected boolean canDmg = true;
    private int dmg;
    public WeaponAbstract(int dmg){
        this.dmg = dmg;
    }
    public int dmg(){
        return this.dmg;
    }
    public void atq(){}
    public boolean canDmg(){
        return this.canDmg;
    }
    public void setDmg(int nb){
        this.dmg += nb;
    }
}
