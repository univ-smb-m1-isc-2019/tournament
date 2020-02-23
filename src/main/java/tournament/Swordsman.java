package tournament;

public class Swordsman extends Fighter {


    public Swordsman() {
        super.dmg = 5;
        super.hp = 100;
        super.mainhand = "1 hand sword";

    }

    public Swordsman(String name) {

        if(name=="Vicious")
        {
            super.dmg = 6;
            super.hp = 100;
            super.vicious = true;
        }
        else {
            super.dmg = 5;
            super.hp = 100;
            super.mainhand = "1 hand sword";
        }
    }

    public Swordsman equip(String buckler) {
        return (Swordsman) super.equip(buckler);
    }
}
