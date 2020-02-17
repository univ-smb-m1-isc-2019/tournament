import me.luca.tournament.Swordsman;
import me.luca.tournament.Viking;

public class Main {
    public static void main (String[] args){
        Swordsman swordsman = new Swordsman()
                .equip("buckler");

        Viking viking = new Viking()
                .equip("buckler");

        System.out.println(swordsman.toString());

        swordsman.engage(viking);

       System.out.println(swordsman.hitPoints());
       System.out.println(viking.hitPoints());


    }
}