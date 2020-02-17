package tournament;

public class Fighter {

    public int hp;
    public int dmg;

    public Fighter() {
    }

    /** A engage B means that A will give the first blow, then B will respond **/
    public void engage(Fighter fighter) {

        System.out.println("Ahp = " + this.getHp() + " Bhp = " + fighter.getHp());

        while( (fighter.getHp() > 0) && (this.getHp() > 0))
        {
            // A engage B
            System.out.println("Ahp = " + this.getHp() + " Bhp = " + fighter.getHp());
            fighter.blow(this.dmg);
            if(fighter.getHp() > 0) // B engage A
            {
                this.blow(fighter.dmg);
            }
        }

    }

    public int hitPoints() {
        return this.hp;
    }

    public void blow(int dmg)
    {
        if(this.getHp() - dmg > 0)
            this.setHp(this.getHp() - dmg);
        else this.setHp(0);
    }

    public Fighter equip(String buckler) {
        return this;
    }

    public int getDmg() {
        return dmg;
    }

    public int getHp() {
        return hp;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
