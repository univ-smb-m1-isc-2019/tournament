package me.luca.tournament;

public class offEquipment extends Equipment {

    public int nbCoup =-1;
    public int rNbCoup=-1;
    public int dmg;

    public offEquipment(String name, int dmg) {
        super(name);
        this.dmg=dmg;
    }

    public offEquipment(String name, int dmg, int nbcoup) {
        super(name);
        this.dmg=dmg;
        this.nbCoup = nbcoup;
        this.rNbCoup = nbCoup;
    }

    public int hit(){

        if(nbCoup == 0){
            nbCoup = rNbCoup;
            return 0;

        }
        if(nbCoup >  0){
            nbCoup -=1;
        }

        return this.dmg;




    }

    @Override
    public void setDura(int i) {

    }

    @Override
    public int getDelivered() {
        return 0;
    }

    @Override
    public int getReceived() {
        return 0;
    }

    @Override
    public int getDura() {
        return 0;
    }

}
