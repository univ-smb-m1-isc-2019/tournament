package Tournoi;

public class Arene {

    public static void main(String[] args){



        Swordsman swordsman = new Swordsman().equip("buckler").equip("armor");


        Highlander highlander = new Highlander();

        Viking viking = new Viking()
                .equip("buckler");



       System.out.println(swordsman.toString());
       System.out.println(viking.toString());
       System.out.println(highlander.toString());
       System.out.println();

       swordsman.engage(highlander);
       System.out.println(swordsman.toString());

    }




}
