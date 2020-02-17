package tournament;

public class Viking extends Fighter {

    public Viking(int hp, int dmg) {
        super(hp, dmg);
    }

    public Viking() {
        super();
    }

    public Viking equip(String buckler) {
        return this;
    }
}
