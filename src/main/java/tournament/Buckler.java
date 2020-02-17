package tournament;

public class Buckler {
    private static int DURABILITY_MAX = 3;
    private boolean willCancel;
    private int durability;
    private int handNeeded;

    public Buckler()
    {
        setDurability(DURABILITY_MAX);
        setWillCancel(true);
        setHandNeeded(1);
    }

    public boolean isWillCancel() {
        return willCancel;
    }

    public int getHandNeeded() {
        return handNeeded;
    }

    public void setHandNeeded(int handNeeded) {
        this.handNeeded = handNeeded;
    }

    public int getDurability() {
        return durability;
    }

    public void setWillCancel(boolean willCancel) {
        this.willCancel = willCancel;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
