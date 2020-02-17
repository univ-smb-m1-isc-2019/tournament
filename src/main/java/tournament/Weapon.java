package tournament;

public class Weapon {
    private int handNeeded;
    private int damage;
    private boolean bucklerBreaker;
    private int maxHit;

    public Weapon(String type)
    {
        switch (type){
            case "axe":
                setHandNeeded(1);
                setDamage(6);
                setBucklerBreaker(true);
                setMaxHit(-1);
                break;
            case"sword":
                setHandNeeded(1);
                setDamage(5);
                setBucklerBreaker(false);
                setMaxHit(-1);
                break;
            case"great sword":
                setHandNeeded(2);
                setDamage(12);
                setBucklerBreaker(false);
                setMaxHit(2);
                break;
            default:
                setHandNeeded(0);
                setDamage(0);
                setBucklerBreaker(false);
                setMaxHit(-1);
                break;

        }

    }

    public boolean hasMaxHit()
    {
        return getMaxHit() > 0;
    }

    public int getMaxHit() {
        return maxHit;
    }

    public void setMaxHit(int maxHit) {
        this.maxHit = maxHit;
    }


    public int getHandNeeded() {
        return handNeeded;
    }

    public void setHandNeeded(int handNeeded) {
        this.handNeeded = handNeeded;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setBucklerBreaker(boolean bucklerBreaker) {
        this.bucklerBreaker = bucklerBreaker;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isBucklerBreaker() {
        return bucklerBreaker;
    }


}
