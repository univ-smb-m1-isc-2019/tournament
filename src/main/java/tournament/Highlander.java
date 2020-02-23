package tournament;

public class Highlander extends Fighter {

    public Highlander(){
        super.hp = 150;
        super.mainhand = "Great Sword";
        super.offhand  = "Great Sword";
        this.dmg = 12;
    }

    public Highlander(String veteran){
        super.hp = 150;
        super.mainhand = "Great Sword";
        super.offhand  = "Great Sword";
        this.dmg = 12;
        if(veteran == "Veteran")
        {
            super.veteran = true;
        }
    }
}
