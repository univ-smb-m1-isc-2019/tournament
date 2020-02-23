package tournament;

public class Weapon {
    public String weaponName;
    public int weaponDamdage;
    public int waitingAttack;
    public int count;
    public boolean oneHandedUse;

    public Weapon(String name){
        this.weaponName = name;
        this.oneHandedUse = true;

        if(name == "axe")
            this.weaponDamdage = 6;
        if(name == "1 hand sword")
            this.weaponDamdage = 5;
        if(name == "Great Sword")
        {
            this.weaponDamdage = 12;
            this.oneHandedUse = false;
            this.waitingAttack = 2;
            this.count = 0;
        }
    }

    /** Méthode qui retourne le montant de l'attaque de l'arme en prenant
     * en compte le délais entre chaque coup.
     * **/
    public int attack(){
        if (this.waitingAttack == 0)
            return this.weaponDamdage;
        else
        {
            if(this.count < this.waitingAttack)
            {
                this.count++;
                return this.weaponDamdage;
            }
            else{
                this.count = 0;
                return 0;
            }
        }
    }

    public String getWeaponName() {
        return weaponName;
    }

    public boolean isOneHandedUse() {
        return oneHandedUse;
    }

    public int getWaitingAttack() {
        return waitingAttack;
    }

    public int getWeaponDamdage() {
        return weaponDamdage;
    }
}
