package me.luca.tournament;

public class Armor extends Equipment{
    private  int received;
    private  int delivered;

    public Armor(String name, int received, int delivered) {
        super(name);
        this.received = received;
        this.delivered = delivered;
    }

    public int getReceived() {
        return received;
    }

    public int getDelivered() {
        return delivered;
    }

    @Override
    public int getDura() {
        return 0;
    }

    @Override
    public int hit() {
        return 0;
    }

    @Override
    public void setDura(int i) {

    }
}
