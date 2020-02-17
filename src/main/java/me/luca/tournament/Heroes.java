package me.luca.tournament;

public class Heroes {

    protected String name;
    protected int pv;
    protected  Equipment rightHand;
    protected  Equipment leftHAnd =null;
    private boolean shield = false;
    private boolean haveAShield;

    public Heroes() {
        this.name = "";
    }

    public Heroes(String name)
    {
        this.name = name;


    }


    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        if (pv < 0 ){
            this.pv = 0;
        }else{
            this.pv = pv;
        }
    }


    public void engage(Heroes h) {
        while (this.getPv() >0 && h.getPv() >0){
            if (!this.haveShield()){
                this.decrasePV(h);
            }
            changeShield(h);
            if (!h.haveShield()){
                h.decrasePV(this);
            }
            h.changeShield(this);       }
    }

    private void changeShield(Heroes heroes) {
        if (this.haveAShield) {
            if (shield) {
                shield = false;
            } else {

                System.out.println(leftHAnd.getDura());

                if (leftHAnd.getDura() > 0) {
                    if (heroes.HitShield()){
                        System.out.println("t)");
                        leftHAnd.setDura(leftHAnd.getDura() - 1);
                    }
                    System.out.println(leftHAnd.getDura());
                    shield = true;

                }
            }

        }

    }

    private boolean HitShield() {
        offEquipment  axe = new offEquipment("hand axe",6);
        System.out.println(this.name);
        if(leftHAnd != null && rightHand != null){
            return (leftHAnd.name.equals("hand axe") || rightHand.name.equals("hand axe"));
        }
        return false;
    }

    private boolean haveShield() {
        return this.shield;
    }

    private void decrasePV(Heroes h) {
        this.setPv(this.getPv() - h.rightHand.getDmg());
    }

    public int  hitPoints() {
        return this.pv;
    }

    public Heroes equip(String name) {
        this.leftHAnd = new defEquipment(name,3);
        this.shield = true;
        this.haveAShield = true;
        return this;
    }

    @Override
    public String toString() {
        String res = "Heroes{" +
                "name='" + name + '\'' +
                ", pv=" + pv;
        if (rightHand != null){
            res += ", rightHand=" + rightHand.name;
        }
        if (leftHAnd != null){
           res += ", leftHAnd=" + leftHAnd.name;}

        res += ", shield=" + shield +
                ", haveAShield=" + haveAShield +
                '}';
        return res;
    }
}
