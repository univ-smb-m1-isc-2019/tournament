package me.guillaume.tournament;

public class Warrior {
    public String name;
    public int hitPoints;
    public Weapon weapon;

    public void engage(Warrior warrior){
        System.out.println("le combat commence");
        boolean fini = false;
        while (!fini){
            // Debut du tour attaque de A
            if(isAlive(warrior) && isAlive(this)){
                warrior.hitPoints -= this.weapon.damage;
                System.out.println(warrior.name + " perd " + this.weapon.damage +  " pdv" );
                System.out.println("il lui reste " + warrior.hitPoints + " pdv");
            }
            else{
                if (isAlive(warrior)){
                    System.out.println(warrior.name + " a gagner avec " + warrior.hitPoints + " pdv");
                    fini = true;
                }
                else{
                    System.out.println(warrior.name + " est mort");
                    fini = true;}
            }
            // Réponse de B
            if (isAlive(this) && isAlive(this)){
                this.hitPoints -= warrior.weapon.damage;
                System.out.println(this.name + " perd " + warrior.weapon.damage +  " pdv" );
                System.out.println("il lui reste " + this.hitPoints + " pdv");
            }
            else{
                if (isAlive(this)){
                    System.out.println(this.name + " a gagner avec " + this.hitPoints + " pdv");
                    fini = true;
                }
                else{
                    System.out.println(this.name + " est mort");
                    fini = true;}
            }
        }
        RegenerateHP(warrior);
        RegenerateHP(this);
    }



    private boolean isAlive(Warrior warrior){
        if (warrior.hitPoints > 0 )
            return true;
        else
            return false;
    }

    private void RegenerateHP(Warrior warrior){
        if (!isAlive(warrior))
            warrior.hitPoints = 0;
    }


}
