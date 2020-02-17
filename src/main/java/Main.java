import me.luca.tournament.Heroes;
import me.luca.tournament.Highlander;
import me.luca.tournament.Swordsman;
import me.luca.tournament.Viking;

public class Main {
    public static void main (String[] args){
        Highlander highlander = new Highlander();

        Swordsman swordsman = new Swordsman()
                .equip("buckler")
                .equip("armor");

        ;
        System.out.println(swordsman.toString());

        highlander.engage(swordsman);


        System.out.println(swordsman.toString());

       System.out.println(swordsman.hitPoints());
       System.out.println(highlander.hitPoints());


    }
}