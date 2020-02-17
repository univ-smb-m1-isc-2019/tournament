package me.guillaume.tournament;
public class Swordsman extends Fighter {
    public Swordsman(){
        this.vie = 100;
        this.weapon = new Weapon("sword", 5);
    }
    public Swordsman(String str){

    }
    public Swordsman equip(String objName){
        if(objName.equals("buckler")){
            this.shield = new Shield();
        }
        return this;
    }
}
