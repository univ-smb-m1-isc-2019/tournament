package me.guillaume.tournament;

public class Viking extends Fighter {
    public Viking(){
        this.vie = 120;
        this.weapon = new Weapon("axe", 6);
    }
    public Viking equip(String objName){
        if(objName.equals("buckler")){
            this.shield = new Shield();
        }
        return this;
    }
}
