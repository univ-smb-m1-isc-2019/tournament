package pack;

public abstract class Warrior{
    private int hp;
    private int damage;

    public Warrior(int hp, int damage){
        this.hp=hp;
        this.damage=damage;
    }

    public int getDamage (){
        return this.damage;
    }

    //Retourne le nombre de pv restants
    public int hitPoints() {
        return hp;
    }

    public void engage(Warrior warrior) {
        while(this.hp > 0 && warrior.hitPoints()>0){

            //Les deux combattants se frappent
            getHit(warrior.getDamage());
            warrior.getHit(getDamage());
        }
    }
    //Quand on est frappé. Retire aux pv, les damages passés en parametre
    public void getHit(int damage){
        this.hp = this.hp - damage;
    }

}
