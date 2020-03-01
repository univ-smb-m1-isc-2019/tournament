package me.guillaume.tournament;

public class Buckler extends Equipment {

    private int condition;
    private boolean protectionIsActive;

    public Buckler(String typeEquipement) {
        super(typeEquipement);
        this.condition = 3;
        this.protectionIsActive = true;
    }

    private void switchProtection(){
        this.protectionIsActive = !this.protectionIsActive;
    }

    private boolean bucklerIsDestructed(){
        return this.condition <= 0;
    }

    public void getDmgfromAttack(Equipment weaponAttack){
        if (!bucklerIsDestructed()){
            if (weaponAttack.typeEquipement.equals("axe") && protectionIsActive)
                this.condition--;
            switchProtection();
        }
    }

    public boolean protectionIsActive() {
        return protectionIsActive;
    }
}
