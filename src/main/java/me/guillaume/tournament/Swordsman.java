package me.guillaume.tournament;

public class Swordsman extends Peasant {

    public Swordsman (){
        super();
        this.hitPoints = 100;
        this.attackPoints = 5;  }
    public Swordsman(String classe){
        new Swordsman();
        this.classe = classe;
    }
    @Override
    public Swordsman equip(String gear){
        if (gear.equals("armor")){
            this.armor = gear;
        }
        if (gear.equals("buckler")){
            this.leftHand = gear;
        }
        if (gear.equals("axe")){
            this.rightHand = gear;
        }
        return this;
    }

    @Override
    public void engage(Peasant p) {
        int nbCoupsAtk = 0;
        int nbCoupsDef = 0;
        int cptBlock = 0;
        boolean block = true;
        int poisonDot = 2;

        if (this.armor.equals("armor")){
            p.attackPoints -= 3;
            this.attackPoints -= 1;
        }

        if (this.rightHand.equals("axe")){ this.attackPoints += 1; }

        while (this.hitPoints > 0 && p.hitPoints > 0){
            if (cptBlock == 3){ this.leftHand = "empty"; }
            if (this.classe.equals("Vicious") && poisonDot > 0){
                p.hitPoints -= 20;
                poisonDot --;
            }
            if (p.leftHand.equals("buckler")) {
                if (nbCoupsDef < 1) {
                    p.hitPoints = p.hitPoints - this.attackPoints;
                    nbCoupsDef++;
                } else if (p.getClass().getSimpleName().equals("Viking")) {
                    nbCoupsDef = 0;
                    cptBlock++;
                } else {
                    nbCoupsDef = 0;
                }
            }else {

                p.hitPoints = p.hitPoints - this.attackPoints;
//                System.out.println("Enemigo" + p.hitPoints);
//                System.out.println("Sword" + this.hitPoints);
            }

            if (p.getClass().getSimpleName().equals("Viking")){
                if(this.getLeftHand().equals("buckler")){
                    if (nbCoupsAtk < 1){
                        nbCoupsAtk++;

                        this.hitPoints = this.hitPoints - p.attackPoints;
                    }else {
                        nbCoupsAtk = 0;
                    }
                }else{

                    this.hitPoints = this.hitPoints - p.attackPoints;
                }
            }
            if (p.getClass().getSimpleName().equals("Highlander")){
                if (!block){
                    if (nbCoupsAtk < 2){
                        if (p.classe.equals("Veteran") && p.hitPoints < 50){
                            this.hitPoints = this.hitPoints - p.attackPoints*2;
                            nbCoupsAtk++;
                            block = true;
                            System.out.println("Sword" + this.hitPoints);
                        }else {
                            this.hitPoints = this.hitPoints - p.attackPoints;
                            nbCoupsAtk++;
                            block = true;
                            //System.out.println("Sword" + this.hitPoints);
                        }
                    }else{
                        nbCoupsAtk = 0;
                    }
                }else{
                    nbCoupsAtk++;
                    block = false;
                }
            }
            this.manageHP();
            p.manageHP();
        }


    }
}
