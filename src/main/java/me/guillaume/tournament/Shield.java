package me.guillaume.tournament;

public class Shield {
    public int stack;
    public int count;
    public Shield(){
        this.stack = 3;
        this.count = 0;
    }
    public int block(Weapon weapon){
        int damage = weapon.dpt;
        if(stack>0){
            if((count%2) == 0){
                damage = 0;
                if(weapon.type.equals("axe")){
                    this.stack--;
                }
            }
            count++;
        }
        return damage;
    }
}
