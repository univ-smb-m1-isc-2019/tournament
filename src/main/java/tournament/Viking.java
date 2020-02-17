package tournament;

public class Viking extends Fighter {

    public Viking() {
        super.hp = 120;
        super.dmg = 6;
        super.mainhand = new Weapon("Axe");
    }

    public Viking equip(String buckler) {
        return this;
    }
}
