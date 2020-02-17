package me.guillaume.tournament;
abstract public class Fighter {
    public int vie;
    public Weapon weapon;
    public Shield shield = null;
    public Fighter(){

    }
    public int hitPoints(){
        return this.vie;
    }

    public void engage(Fighter f2){
        while (this.vie > 0 && f2.vie > 0){
            System.out.println(this.vie);
            System.out.println(f2.vie);
            f2.vie = this.attack(f2);
            if(f2.vie > 0){
                this.vie = f2.attack(this);
            }
        }
    }

    public int attack(Fighter f2){
        if(f2.shield == null){
            f2.vie = f2.vie - this.weapon.dpt;
        }else{
            f2.vie = f2.vie - f2.shield.block(this.weapon);
        }
        if(f2.vie < 0) f2.vie = 0;
        return f2.vie;
    }

    public Fighter equip(String objName){
        return this;
    }

}
