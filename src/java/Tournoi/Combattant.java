package Tournoi;

import java.util.ArrayList;

public class Combattant {

    private ArrayList<String> equipements = new ArrayList<String>();
    private int pLife;
    private Arme arme;
    private String spec = "aucune";



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

    public Combattant(int life,String spec, Arme arme){
        this.pLife = life;
        this.arme = arme;
        this.spec = spec;
    }


    public void combat(Combattant Comb)
    {
        int cpt = 0;
        int coup = 0;
        int coup_H = 0;
        int coup_H_max = 2;
        while (this.pLife > 0 && Comb.pLife > 0)
        {
            System.out.println(this.getClass().getSimpleName() + ": " + this.pLife + " HP " + "| " + Comb.getClass().getSimpleName() +": " + Comb.pLife + " HP");



            if(Comb.getClass().getSimpleName().equals("Viking") ){

                // A frappe B

                if(Comb.isEquipé("buckler") && cpt%2 != 0){
                    Comb.setpLife(Comb.pLife-  this.arme.getDamage() );
                }else if(Comb.isEquipé("buckler") && cpt%2 == 0){

                }else{
                    Comb.setpLife(Comb.pLife-this.arme.getDamage());
                }

                // B frappe A
                if( Comb.pLife > 0 )
                {
                    if( this.isEquipé("buckler") && cpt%2 != 0 && coup < 3 )
                    {
                        this.setpLife(this.pLife- Comb.arme.getDamage() );


                    }else if(this.isEquipé("buckler") && cpt%2 == 0 && coup < 3 ){
                        coup++;

                    }else if(this.isEquipé("buckler") && cpt%2 == 0 && coup == 3){
                        this.retier_equipement("buckler");
                    }else{
                        this.setpLife(this.pLife-Comb.arme.getDamage());
                    }

                }


            }else if(Comb.getClass().getSimpleName().equals("Highlander") ){

                // A frappe B

                Comb.setpLife(Comb.pLife- ( this.arme.getDamage() -1 ) );



                // B frappe A
                if( Comb.pLife > 0 )
                {
                    if(coup_H < 2 )
                    {
                        if( this.isEquipé("buckler") && this.isEquipé("armor") && cpt%2 != 0 )
                        {
                            this.setpLife(this.pLife - ( Comb.arme.getDamage() - 3 )  );
                            coup_H ++;

                        }else if(this.isEquipé("buckler") && this.isEquipé("armor") && cpt%2 == 0 ){
                            coup_H ++;
                        }
                    }else{
                        coup_H = 0;
                    }

                  
                }

            }
            cpt++;


        }

        if(this.pLife <=  0)
        {
            this.setpLife(0);
            System.out.println(this.getClass().getSimpleName() + ": " + this.pLife +" HP " + "| " +Comb.getClass().getSimpleName() + ": " + Comb.pLife + " HP");
            System.out.println();
            System.out.println(this.getClass().getSimpleName() + " à succombé .... " + Comb.getClass().getSimpleName() + " remporte le combat !");
        }else{
            Comb.setpLife(0);

            System.out.println("A :"+this.pLife +" HP "+ " B :" + Comb.pLife + " HP");
            System.out.println();
            System.out.println(Comb.getClass().getSimpleName() + " à succombé .... " + this.getClass().getSimpleName() + " remporte le combat !");

        }

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

    public Combattant retier_equipement(String buckler) {

        for (int counter = 0; counter < equipements.size(); counter++) {
            if( this.equipements.get(counter).equals(buckler) ){
                this.equipements.remove(counter);
            }
        }

        return this;
    }


    public String affiche_equipements(){

        String str = "";

        if(this.equipements.isEmpty()){
            str = "[aucun equipement]" ;
        }else {
            for (int counter = 0; counter < equipements.size(); counter++) {
                str += "[" + this.equipements.get(counter) + "] ";
            }
        }

        return str;

    }

    public String toString(){

        String str = this.getClass().getSimpleName() + " a " + this.getpLife() + " HP" + " est armé de [" + this.getArme().getNom() + "]" + " et" +
                " est equipé de : [ " + affiche_equipements() + " ]" + " et a pour spécifité : [" + this.getSpec() + "]" ;


        return str;
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

        return this.equipements.contains(eq);
    }


}
