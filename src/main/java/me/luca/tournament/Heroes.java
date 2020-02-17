package me.luca.tournament;

public class Heroes {

    protected String name;
    protected int pv;
    protected  Equipment rightHand;
    protected  Equipment leftHAnd =null;
    private boolean shield = false;
    private boolean haveAShield;
    private Equipment armor;

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

    private void attaque(Heroes h) {
        int var = this.hit();
        //System.out.println(var);

        if(var == 0){
            System.out.println(this.name + "je me repose");

        }else{
            System.out.println(this.name + " attaque ");

            if (!h.haveShield()){
                h.decrasePV(var);
            }else{
                System.out.println(h.name + "je me deffends ");
            }
            h.changeShield(this);
        }
        }



    public void engage(Heroes h) {
        boolean fini = (this.getPv() > 0 && h.getPv() > 0);
        while (fini) {
            this.attaque(h);
            System.out.println(h.name + h.pv);

                h.attaque(this);
                System.out.println(this.pv);


            fini = (this.getPv() > 0 && h.getPv() > 0);
        }
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

    private void decrasePV(int h) {
        if (armor != null){
            this.setPv(this.getPv() - (h - this.armor.getReceived()));

        }else{
            this.setPv(this.getPv() - h);

        }
    }

    private int hit() {
        int hit = rightHand.hit();
        if(this.armor != null ){
            return hit-armor.getDelivered();
        }else{
            return hit;
        }




    }

    public int  hitPoints() {
        return this.pv;
    }

    public Heroes equip(String name) {
        Equipment e = Equipment.convertiseur(name);
        if(e instanceof defEquipment){
            this.leftHAnd = e;
            this.shield = true;
            this.haveAShield = true;
        }
        if(e instanceof Armor){
            this.armor =e;
        }
        if(e instanceof offEquipment){

        }

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
        if (this.armor != null){
            res += ", armure=" + this.armor.name;}


        res += ", shield=" + shield +
                ", haveAShield=" + haveAShield +
                '}';
        return res;
    }
}
