package Tournoi;

public class Arme {
    private String nom;
    private int damage;


    public Arme(String nom, int damage) {
        this.nom = nom;
        this.damage = damage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
