package me.guillaume.tournament;

public class Bouclier {
    public int stack;
    public int count;

    public Bouclier() {
        this.stack = 0;
        this.count = 0;
    }

    public int block(Weapon weapon) {
        int damage = weapon.dmg;
        if (stack < 3) {
            if ((count % 2) == 0) {
                damage = 0;
                if (weapon.name.equals("axe")) {
                    this.stack++;
                }
            }
            count++;
        }
        return damage;
    }
}