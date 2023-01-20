package bo;

public class Enfant {
    private int numeroSecu;
    private String nom;
    private String prenom;
    private String adresse;
    private String sage;

    public Enfant(int numeroSecu, String nom, String prenom, String adresse, String sage) {
        this.numeroSecu = numeroSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.sage = sage;
    }

    public String toString() {
        return "Enfant [numeroSecu=" + numeroSecu + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
                + ", sage=" + sage + "]";
    }
}
