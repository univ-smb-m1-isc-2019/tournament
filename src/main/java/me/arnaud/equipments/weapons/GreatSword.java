package me.arnaud.equipments.weapons;

public class GreatSword extends WeaponAbstract {
    private int atqCount;
    public GreatSword() {
        super(12);
        this.atqCount = 0;
    }

    public void atq(){
        if (this.atqCount == 2){
            this.canDmg = false;
        }else if (this.atqCount == 3){
            this.canDmg = true;
            this.atqCount = 0;
        }
        this.atqCount++;
    }

}
