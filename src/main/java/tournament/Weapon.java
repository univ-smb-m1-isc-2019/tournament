package tournament;

public class Weapon {
    private int handNeeded;
    private int damage;
    private boolean bucklerBreaker;

    public Weapon(String type)
    {
        switch (type){
            case "axe":
                setHandNeeded(1);
                setDamage(6);
                setBucklerBreaker(true);
                break;
            case"sword":
                setHandNeeded(1);
                setDamage(5);
                setBucklerBreaker(false);
                break;
            case" great sword":
                setHandNeeded(2);
                setDamage(12);
                setBucklerBreaker(false);
                break;
            default:
                setHandNeeded(0);
                setDamage(0);
                setBucklerBreaker(false);
                break;

        }

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
