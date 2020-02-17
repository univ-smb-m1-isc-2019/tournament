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


                if (leftHAnd.getDura() > 0) {
                    if (heroes.HitShield()){
                        leftHAnd.setDura(leftHAnd.getDura() - 1);
                    }
                    shield = true;

                }
            }

        }

    }

    private boolean HitShield() {
        offEquipment  axe = new offEquipment("hand axe",6);
        if(leftHAnd != null && rightHand != null){
            return (leftHAnd.name.equals("hand axe") || rightHand.name.equals("hand axe"));
        }
        return false;
    }

    private boolean haveShield() {
        return this.shield;
    }

    private void decrasePV(Heroes h) {
        this.setPv(this.getPv() - h.hit());
    }

    private int hit() {
        int hit = rightHand.hit();
        if (hit > 0 ){
            System.out.println(this.name + "j attaque ");
            return hit;
        }else{
            System.out.println(this.name + "je me repose ");
            return 0;
        }


    }

    public int  hitPoints() {
        return this.pv;
    }

    public Heroes equip(String name) {
        Equipment e = Equipment.convertiseur(name);

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
