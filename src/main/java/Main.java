import me.luca.tournament.Swordsman;
import me.luca.tournament.Viking;

public class Main {
    public static void main (String[] args){
        Swordsman swordsman = new Swordsman();

        Viking viking = new Viking();

        swordsman.engage(viking);
       System.out.println(swordsman.hitPoints());


    }
}