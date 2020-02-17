package me.luca.tournament;

public class defEquipment extends Equipment {

    private int dura;

    public defEquipment(String name, int i) {
        super(name);
        this.dura = i;
    }


    @Override
    public int getDura() {
        return this.dura;
    }

    @Override
    public int hit() {
        return 0;
    }

    @Override
    public void setDura(int i) {
        this.dura = i;
    }

    @Override
    public int getDelivered() {
        return 0;
    }

    @Override
    public int getReceived() {
        return 0;
    }
}
