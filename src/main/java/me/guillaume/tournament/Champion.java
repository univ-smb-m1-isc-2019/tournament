package me.guillaume.tournament;

public class Champion {
    protected String name;
    protected int hp;
    protected Weapon weapon;

    public Champion() {
        this.name = "";
    }

    public Champion(String name) {
        this.name = name;
    }

    public void engage(Champion champ) {

        while(this.isAlive() && champ.isAlive()){

            if( this.hp - champ.weapon.getDmg()>0){
            this.hp = this.hp - champ.weapon.getDmg();
            }
            else{
                this.hp = 0;
            }

            if(champ.hp - this.weapon.getDmg() >0){
            champ.hp = champ.hp - this.weapon.getDmg();
            } else {
                champ.hp = 0;
            }

        }

    }

    private boolean isAlive() {
        return this.hp > 0;
    }



    public int hitPoints() {
        return this.hp;
    }

    public Champion equip(String buckler) {

        return this;
    }
}