package tournament;

public class Armor {
    private static int REDUCE_DAMAGE_DEFAULT = 1;
    private static int REDUCE_SHOCK_DEFAULT = 3;
    private int reduceDamage;
    private int reduceShock;

    public Armor()
    {
        setReduceDamage(REDUCE_DAMAGE_DEFAULT);
        setReduceShock(REDUCE_SHOCK_DEFAULT);
    }

    public int getReduceDamage() {
        return reduceDamage;
    }

    public int getReduceShock() {
        return reduceShock;
    }



    public void setReduceDamage(int reduceDamage) {
        this.reduceDamage = reduceDamage;
    }

    public void setReduceShock(int reduceShock) {
        this.reduceShock = reduceShock;
    }


}
