package tournament;

public class Arena {

    public static void main (String[] args) {

        Fighter f1 = new Viking().equip("buckler");
        Fighter f2 = new Swordsman();
        // System.out.println(" mainHandIsEmpty = " + f1.offHandIsEmpty());
        System.out.println(f1.getMainhand() + " " + f1.getOffhand());

        // f1.engage(f2);
    }



}
