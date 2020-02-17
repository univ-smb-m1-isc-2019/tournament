package me.luca.tournament;

public class offEquipment extends Equipment {

    public int nbCoup =-1;
    public int rNbCoup=-1;

    public offEquipment(String name, int dmg) {
        super(name,dmg);
    }

    public offEquipment(String name, int dmg, int nbcoup) {
        super(name,dmg);
        this.nbCoup = nbcoup;
        this.rNbCoup = nbCoup;
    }


    public int getDmg() {
        return super.dmg;
    }

    public int hit(){

        if(nbCoup == 0){
            nbCoup = rNbCoup;
            return 0;

        }
        if(nbCoup >  0){
            nbCoup -=1;
        }

        return super.dmg;




    }

    @Override
    public int getDura() {
        return 0;
    }

}
