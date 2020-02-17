package me.luca.tournament;

public abstract class Equipment {
    protected int dura;
    protected String name;
    protected int dmg;

    public Equipment(String name, int i) {
        this.name = name;
        this.dmg = i;
    }

    public Equipment(String name) {
        this.name = name;
        this.dmg = 0;
    }

    public void setDura(int dura) {
        this.dura = dura;
    }

    public abstract int getDmg();

    public abstract int getDura();
}
