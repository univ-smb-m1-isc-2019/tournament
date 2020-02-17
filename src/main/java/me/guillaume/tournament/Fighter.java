package me.guillaume.tournament;

public class Fighter {
    private int hitPoints = 0;
    private String type;
    private String equipement;

    public Fighter() {

    }

  public Fighter(String type){
    this.type=type;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints(){
        return this.hitPoints;
    }

    public int hitPoints() {
        return getHitPoints();
    }

}
