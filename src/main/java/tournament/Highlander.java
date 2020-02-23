package tournament;

public class Highlander extends Fighter {

    public Highlander(){
        super.hp = 150;
        super.baseHp = 150;
        this.dmg = 12;
        super.hands = new Weapon("Great Sword");
    }

    public Highlander(String veteran){
        super.hp = 150;
        super.baseHp = 150;
        super.hands = new Weapon("Great Sword");
        this.dmg = 12;
        if(veteran == "Veteran")
        {
            super.veteran = true;
        }
    }
}
