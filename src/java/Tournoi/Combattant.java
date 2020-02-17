package Tournoi;

import java.util.ArrayList;
import java.util.Iterator;

public class Combattant {

    private ArrayList<String> equipements = new ArrayList<String>();
    private int pLife;
    private Arme arme;
    private String spec;



    public ArrayList<String> getEquipements() {
        return equipements;
    }

    public void setEquipements(ArrayList<String> equipements) {
        this.equipements = equipements;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Combattant(int life, Arme arme){
        this.pLife = life;
        this.arme = arme;
    }

    public Combattant(int life,String spec){
        this.pLife = life;
        this.spec = spec;
    }


    public void combat(Combattant Comb)
    {
        int cpt = 0;
        int coup = 0;
        while (this.pLife > 0 && Comb.pLife > 0)
        {
            System.out.println("A :"+this.pLife +" HP "+ " B :" + Comb.pLife + " HP");

            if(Comb.isEquipé("buckler") && cpt%2 != 0){
                Comb.setpLife(Comb.pLife-this.arme.getDamage());
            }else if(Comb.isEquipé("buckler") && cpt%2 == 0){

            }else{
                Comb.setpLife(Comb.pLife-this.arme.getDamage());
            }



            if( Comb.pLife > 0 )
            {
               if( this.isEquipé("buckler") && cpt%2 != 0 && coup < 3  )
               {
                   this.setpLife(this.pLife-Comb.arme.getDamage());

               }else if(this.isEquipé("buckler") && cpt%2 == 0 && coup < 3){
                   coup++;

               }else if(this.isEquipé("buckler") && cpt%2 != 0 && coup == 3){
                   this.unequip("buckler");
               }else{
                   this.setpLife(this.pLife-Comb.arme.getDamage());
               }

        }
            cpt++;

        }

        if(this.pLife <=  0)
        {
            this.setpLife(0);
            System.out.println("Le Combattant A à succombé ....");
        }else{
            Comb.setpLife(0);
            System.out.println("Le Combattant B à succombé ....");

        }
        System.out.println("A :"+this.pLife +" HP "+ " B :" + Comb.pLife + " HP");

    }

    public int getpLife() {
        return pLife;
    }

    public void setpLife(int pLife) {
        this.pLife = pLife;
    }


    public Combattant equip(String buckler) {
        this.equipements.add(buckler);
        return this;
    }

    public String get_an_equip(String eq){

        for (int counter = 0; counter < equipements.size(); counter++) {
            if( this.equipements.get(counter).equals(eq) ){
                return eq;
            }
        }
        return "Cet equipement n'est pas dans l'inventaire";
    }

    public boolean isEquipé(String eq){

        boolean b = false;

        for (int counter = 0; counter < equipements.size(); counter++) {
            b = this.equipements.get(counter).equals(eq) ;

            }
        return b;
    }
    public Combattant unequip(String buckler) {
        this.equipements.remove(buckler);
        return this;
    }


}
