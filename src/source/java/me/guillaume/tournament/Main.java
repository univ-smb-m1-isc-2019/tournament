package me.guillaume.tournament;

public class Main {
    public static void main (String[] args){
       //Test1();
        //Test2();
        Test3();
    }

    public static void Test1(){
        Swordsman swordsman = new Swordsman();
        Viking viking = new Viking();
        swordsman.engage(viking);
    }

    public static void Test2(){
        Swordsman swordsman = (Swordsman) new Swordsman()
                .equip("buckler");

        Viking viking = (Viking) new Viking()
                .equip("buckler");

        swordsman.engage(viking);
    }

    public static void Test3(){
        Highlander highlander = new Highlander();

        Swordsman swordsman = (Swordsman) new Swordsman()
                .equip("buckler")
                .equip("armor");

        swordsman.engage(highlander);
    }
}
