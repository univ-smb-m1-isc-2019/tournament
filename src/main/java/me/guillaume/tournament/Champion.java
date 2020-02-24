package me.guillaume.tournament;

public class Champion {
    protected String name;
    protected int hp;
    protected Weapon weapon;
    protected Bouclier bouclier;



    public void engage(Champion champ) {

        while (this.isAlive() && champ.isAlive()) {
            champ.hp = this.sendDmg(champ);
            if (champ.hp > 0) {
                this.hp = champ.sendDmg(this);
            }
        }

    }

    public int sendDmg(Champion champion) {
        if (champion.bouclier == null) {
            champion.hp = champion.hp - this.weapon.dmg;
        } else {
            champion.hp = champion.hp - champion.bouclier.block(this.weapon);
        }
        if (champion.hp < 0) champion.hp = 0;
        return champion.hp;
    }

    private boolean isAlive() {
        return this.hp > 0;
    }


    public int hitPoints() {
        return this.hp;
    }


}