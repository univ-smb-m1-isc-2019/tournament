package tournament;

public class Fighter {

    public int hp;
    public int dmg;

    public Fighter(int hp, int dmg)
    {
        this.hp = hp;
        this.dmg = dmg;
    }

    public Fighter() {
    }

    public void engage(Fighter fighter) {
    }

    public boolean hitPoints() {
        return false;
    }

    public Fighter equip(String buckler) {
        return this;
    }
}
