package bo;

public class Cadeau {
    private String reference;
    private String libelle;
    private boolean fabrique;

    public Cadeau() {
    }
    public Cadeau(String reference, String libelle, boolean fabrique) {
        this.reference = reference;
        this.libelle = libelle;
        this.fabrique = fabrique;
    }

    public String toString() {
        return "Cadeau [reference=" + reference + ", libelle=" + libelle + ", fabrique=" + fabrique + "]";
    }
}
