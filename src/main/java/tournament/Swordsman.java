package tournament;

public class Swordsman extends Fighter {


    public Swordsman(int hp, int dmg) {
        super(hp, dmg);
    }

    public Swordsman() {

    }

    public Swordsman(String name) {
    }

    public Swordsman equip(String buckler) {
        return this;
    }
}
