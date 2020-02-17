package me.guillaume.tournament;

public class Warrior {

    public String name;
    public int defencePoints;
    public int hitPoints;
    public Weapon weapon;
    public OffHand offHand;
    public Armor armor;
    public boolean fini = false;
    public boolean noAtk = false;

    public void engage(Warrior warrior){
        System.out.println("le combat commence");
        if (HaveArmor(this)){
            UpdateStats(this);
        }
        if (HaveArmor(warrior)){
            UpdateStats(warrior);
        }
        while (!fini){
            Attack(this,warrior);
            Attack(warrior,this);
        }
        RegenerateHP(warrior);
        RegenerateHP(this);
    }
    public Warrior equip(String stuff){
        Armor armor;
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
            case "great sword":
                weapon = new Weapon("great sword",12);
                this.weapon = weapon;
                break;
            case "buckler":
                offHand = new OffHand("buckler");
                this.offHand = offHand;
                break;
            case "armor":
                armor = new Armor("armor");
                this.armor = armor;
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
                    Damage(atk, def);
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

    private boolean HaveArmor(Warrior warrior){
        if (warrior.armor != null)
            return true;
        else
            return false;
    }
    private boolean UpdateGreatSword(Warrior atk){
            if (atk.weapon.greatSwordCount >=2){
                System.out.println(atk.name + " doit se reposer avant d'attaquer");
                atk.weapon.greatSwordCount = 0;
                return true;
            }else{
                atk.weapon.greatSwordCount += 1;
                return false;
            }
    }


    private void UpdateStats(Warrior warrior){
        warrior.defencePoints = 3;
        warrior.weapon.damage -= 1;
    }

    private void Damage(Warrior atk, Warrior def){
        if (atk.weapon.isGreatSword){
            if (UpdateGreatSword(atk)){
                System.out.println(atk.name + " doit se reposer avant d'attaquer");
            }
            else{
                def.hitPoints -= (atk.weapon.damage - def.defencePoints);
                System.out.println(def.name + " perd " + (atk.weapon.damage - def.defencePoints) +  " pdv" );
                System.out.println("il lui reste " + def.hitPoints + " pdv");
            }
        }
        else{
            def.hitPoints -= (atk.weapon.damage - def.defencePoints);
            System.out.println(def.name + " perd " + (atk.weapon.damage - def.defencePoints) +  " pdv" );
            System.out.println("il lui reste " + def.hitPoints + " pdv");
        }
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
                if (atk.weapon.isGreatSword){
                    if (UpdateGreatSword(atk)){
                        System.out.println(atk.name + " doit se reposer avant d'attaquer");
                    }
                    else{
                        System.out.println(def.name + " a bloquer le coup avec son bouclier");
                        def.offHand.block += 1;
                    }
                }else{
                    System.out.println(def.name + " a bloquer le coup avec son bouclier");
                    def.offHand.block += 1;
                }
            }
            else{

                    Damage(atk, def);
                    def.offHand.block += 1;
            }
        }
        else{
               Damage(atk, def);
                def.offHand.block += 1;
        }
    }
}
