package me.guillaume.tournament;

public class Warrior {
    public String name;
    public int hitPoints;
    public Weapon weapon;
    public Weapon offHand;
    public boolean fini = false;

    public void engage(Warrior warrior){
        System.out.println("le combat commence");
        while (!fini){
            Attack(this,warrior);
            Attack(warrior,this);
        }
        RegenerateHP(warrior);
        RegenerateHP(this);
    }
    public Warrior equip(String stuff){
        Weapon weapon;
        switch(stuff) {
            case "sword":
                weapon = new Weapon("sword",5);
                this.weapon = weapon;
                break;
            case "axe":
                weapon = new Weapon("axe",6);
                this.weapon = weapon;
                break;
            case "buckler":
                weapon = new Weapon("buckler",true);
                this.offHand = weapon;
                break;
            default:
                System.out.println("erreur item non reconnue");
        }
        return this;
    }

    private void Attack(Warrior atk, Warrior def){
        if(IsAlive(def) && IsAlive(atk)){
            def.hitPoints -= atk.weapon.damage;
            System.out.println(def.name + " perd " + atk.weapon.damage +  " pdv" );
            System.out.println("il lui reste " + def.hitPoints + " pdv");
        }
        else{
            if (IsAlive(def)){
                System.out.println(def.name + " a gagner avec " + def.hitPoints + " pdv");
                fini = true;
            }
            else{
                System.out.println(def.name + " est mort");
                fini = true;}
        }
    }

    private boolean IsAlive(Warrior warrior){
        if (warrior.hitPoints > 0 )
            return true;
        else
            return false;
    }

    private void RegenerateHP(Warrior warrior){
        if (!IsAlive(warrior))
            warrior.hitPoints = 0;
    }

    private boolean HaveShield(Warrior warrior){
        if (warrior.offHand.isShield)
            return true;
        else
            return false;
    }


}
