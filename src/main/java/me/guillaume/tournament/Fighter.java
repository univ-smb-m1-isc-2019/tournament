package me.guillaume.tournament;
public class Fighter {
    public int vie;
    public String nom;

    public int hitPoints(){
        return this.vie;
    }

    public void engage(Fighter f2){

    }
    public Fighter equip(String objName){
        return this;
    }

}
