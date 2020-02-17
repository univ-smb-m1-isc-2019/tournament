package me.arnaud.equipments.weapons;

public class GreatSword extends WeaponAbstract {
    private boolean canAtq;
    private int atqCount;
    public GreatSword() {
        super(12);
        this.canAtq = true;
        this.atqCount = 0;
    }

    private void atq(){
        this.atqCount++;
        if (this.atqCount == 2){
            this.canAtq = false;
            this.atqCount = 0;
        }
    }
    public boolean canAtq(){
        return this.canAtq;
    }
}
