package me.luca.tournament;

public class Heroes {

    protected String name;
    protected int pv;
    protected  Equipment rightHand;
    protected  Equipment leftHAnd;

    public Heroes() {
        this.name = "";
        this.leftHAnd = null;
    }

    public Heroes(String name)
    {
        this.name = name;
        this.leftHAnd = null;

    }


    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        if (pv < 0 ){
            this.pv = 0;
        }else{
            this.pv = pv;
        }
    }


    public void engage(Heroes h) {
        while (this.getPv() >0 && h.getPv() >0){
            this.decrasePV(h);
            h.decrasePV(this);
        }
    }

    private void decrasePV(Heroes h) {
        this.setPv(this.getPv() - h.rightHand.getDmg());
    }

    public int  hitPoints() {
        return this.pv;
    }

    public Heroes equip(String name) {
        this.leftHAnd = new defEquipment(name);
        return this;
    }
}
