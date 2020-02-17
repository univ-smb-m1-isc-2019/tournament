package Tournoi;

public class Combattant {

    private int pLife;
    private int dmg;

    public Combattant(int life, int damage){
        this.pLife = life;
        this.dmg = damage;

    }

    public int getpLife() {
        return pLife;
    }

    public void setpLife(int pLife) {
        this.pLife = pLife;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

}
