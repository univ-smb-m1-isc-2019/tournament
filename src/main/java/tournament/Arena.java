package tournament;

public class Arena {

    public static void main (String[] args) {

        Fighter f1 = new Swordsman().equip("buckler").equip("armor");;
        Fighter f2 = new Highlander("veteran");
        // System.out.println(" mainHandIsEmpty = " + f1.offHandIsEmpty());
        // System.out.println(f1.getMainhand() + " " + f1.getOffhand());

        f1.engage(f2);
        System.out.println("Vie Sword = " + f1.getHp() + " vie high = " + f2.getHp());
    }



}
