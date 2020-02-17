package Tournoi;

public class Arene {

    public static void main(String[] args){

        Swordsman swordsman = new Swordsman()
                .equip("buckler");

        Viking viking = new Viking()
                .equip("buckler");

        System.out.println(viking.isEquipé("buckler"));
        System.out.println(viking.get_an_equip("buckler"));

        swordsman.engage(viking);


    }




}
