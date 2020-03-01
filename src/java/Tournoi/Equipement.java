package Tournoi;

public class Equipement {
    private String nom;
    private String effect;

    public Equipement(String nom, String effet) {
        this.nom = nom;
        this.effect = effet;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
