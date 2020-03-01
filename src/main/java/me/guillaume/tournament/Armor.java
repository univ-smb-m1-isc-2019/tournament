package me.guillaume.tournament;

public class Armor extends Equipment {

    private final static int REDUCE_RECEIVED_DAMAGES = 3;
    private final static int REDUCE_DELIVERED_DAMAGES = 1;

    public Armor(String typeEquipment) {
        super(typeEquipment);
    }

    public int protectionFromAttack(int dmg){
        if(dmg > REDUCE_RECEIVED_DAMAGES)
            return dmg - REDUCE_RECEIVED_DAMAGES;
        else
            return 0;
    }

    public int attackWithArmor(int dmg){
        if(dmg > REDUCE_DELIVERED_DAMAGES)
            return dmg - REDUCE_DELIVERED_DAMAGES;
        else
            return 0;
    }


}
