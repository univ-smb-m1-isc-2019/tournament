package Tournoi;

public class Combattant {


    private int pLife;
    private Arme arme;
    private String spec;


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
        while (this.pLife > 0 && Comb.pLife > 0)
        {
            System.out.println("A :"+this.pLife +" HP "+ " B :" + Comb.pLife + " HP");

            Comb.setpLife(Comb.pLife-this.arme.getDamage());


            if( Comb.pLife > 0 )
            {
                this.setpLife(this.pLife-Comb.arme.getDamage());
            }

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
        return this;
    }
}
