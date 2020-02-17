package me.luca.tournament;

public class Heroes {

    protected String name;
    protected int pv;
    protected  Equipment equipment;

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

    public Heroes() {
        this.name = "";
    }

    public Heroes(String name) {
        this.name = name;
    }

    public void engage(Heroes h) {
        while (this.getPv() >0 && h.getPv() >0){
            this.decrasePV(h);
            h.decrasePV(this);
        }
    }

    private void decrasePV(Heroes h) {
        this.setPv(this.getPv() - h.equipment.getDmg());
    }

    public int  hitPoints() {
        return this.pv;
    }

    public Heroes equip(String buckler) {

        return this;
    }
}
