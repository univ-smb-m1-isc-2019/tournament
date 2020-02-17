package me.guillaume.tournament;

public class Warrior {
    public String name;
    public int hitPoints;
    public Weapon weapon;
    public OffHand offHand;
    public boolean fini = false;

    public void engage(Warrior warrior){
        System.out.println("le combat commence");
        while (!fini){
            if (HaveOffHand(this)){

            }
            Attack(this,warrior);
            Attack(warrior,this);
        }
        RegenerateHP(warrior);
        RegenerateHP(this);
    }
    public Warrior equip(String stuff){
        OffHand offHand;
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
                offHand = new OffHand("buckler");
                this.offHand = offHand;
                break;
            default:
                System.out.println("erreur item non reconnue");
        }
        return this;
    }

    private void Attack(Warrior atk, Warrior def){
        if(IsAlive(def) && IsAlive(atk)){
            if (HaveOffHand(def)){
                Block(atk,def);
            }
            else {
                def.hitPoints -= atk.weapon.damage;
                System.out.println(def.name + " perd " + atk.weapon.damage +  " pdv" );
                System.out.println("il lui reste " + def.hitPoints + " pdv");
                }
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

    private boolean HaveOffHand(Warrior warrior){
        if (warrior.offHand != null)
            return true;
        else
            return false;
    }

    private void Block(Warrior atk,Warrior def){
        if (def.offHand.axeCount >= 3){
            def.offHand.destroyed = true;

        }
        if (def.offHand.destroyed == true){
            System.out.println("le bouclier de "+ def.name + " a été détruit");
        }
        if (!def.offHand.destroyed){
            if (def.offHand.block %2 == 0){
                if (atk.weapon.name.equals("axe")){
                    def.offHand.axeCount += 1;
                }
                System.out.println(def.name + " a bloquer le coup avec son bouclier");
                def.offHand.block += 1;
            }
            else{
                def.hitPoints -= atk.weapon.damage;
                System.out.println(def.name + " perd " + atk.weapon.damage +  " pdv" );
                System.out.println("il lui reste " + def.hitPoints + " pdv");
                def.offHand.block += 1;
            }
        }
        else{
            def.hitPoints -= atk.weapon.damage;
            System.out.println(def.name + " perd " + atk.weapon.damage +  " pdv" );
            System.out.println("il lui reste " + def.hitPoints + " pdv");
            def.offHand.block += 1;
        }
    }
}
