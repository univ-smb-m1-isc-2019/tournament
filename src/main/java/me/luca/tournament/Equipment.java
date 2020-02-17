package me.luca.tournament;

public abstract class Equipment {
    protected String name;


    public Equipment(String name) {
        this.name = name;

    }

    public static Equipment convertiseur(String name) {
        if (name =="buckler" ) {
            return new defEquipment(name,3);
        }
        if(name == "armor"){
            return new Armor(name,3,1);
        }
        if (name == "axe"){
            return new offEquipment("hand axe",6);
        }
    return null;
    }

    public abstract int getDura();

    public abstract int hit();

    public abstract void setDura(int i);

    public abstract int getDelivered();

    public abstract int getReceived();
}
