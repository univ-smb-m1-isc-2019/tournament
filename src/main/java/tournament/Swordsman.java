package tournament;

public class Swordsman extends Fighter {


    public Swordsman() {
        super.dmg = 5;
        super.hp = 100;
        super.baseHp = 100;
        super.mainhand = "1 hand sword";
        super.hands = new Weapon("1 hand sword");

    }

    public Swordsman(String name) {

        super.hp = 100;
        super.baseHp = 100;

        if(name=="Vicious")
        {
            super.dmg = 6;
            super.vicious = true;
            super.hands = new Weapon("axe");
        }
        else {
            super.dmg = 5;
            super.mainhand = "1 hand sword";
            super.hands = new Weapon("1 hand sword");
        }
    }

    public Swordsman equip(String buckler) {
        return (Swordsman) super.equip(buckler);
    }
}
