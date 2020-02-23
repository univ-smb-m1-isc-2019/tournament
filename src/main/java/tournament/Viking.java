package tournament;

public class Viking extends Fighter {

    public Viking() {
        super.hp = 120;
        super.dmg = 6;
        super.mainhand = "Axe";

        super.hands = new Weapon("axe");
    }

    public Viking equip(String buckler) {
        return (Viking) super.equip(buckler);
    }
}
