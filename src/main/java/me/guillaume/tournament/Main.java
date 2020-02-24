package me.guillaume.tournament;

public class Main {
    public static void main(String[] args) {
        Swordsman swordsmanShield = new Swordsman()
                .equip("buckler");

        Viking vikingShield = new Viking()
                .equip("buckler");

        swordsmanShield.engage(vikingShield);

        Swordsman swordsman = new Swordsman();

        Viking viking = new Viking();

        swordsman.engage(viking);
        System.out.println("Viking hp: " + viking.hitPoints());
        System.out.println("Swordsman hp: " + swordsman.hitPoints());

        System.out.println("Viking shieldé hp: " + vikingShield.hitPoints());
        System.out.println("Swordsman shieldé hp: " + swordsmanShield.hitPoints());
    }
}
