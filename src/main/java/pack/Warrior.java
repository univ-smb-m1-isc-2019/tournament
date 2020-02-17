package pack;

public abstract class Warrior{
    private int hp;
    public Warrior(int hp){
        this.hp=hp;
    }

    public void equip(String buckler) {
    }

    public int hitPoints() {
        return hp;
    }

    public void engage(Warrior warrior) {


    }
}
