package bo;

public class Livraison {
    private String etat;
    private Enfant enfant;
    private Cadeau cadeau;

    public Livraison() {
    }

    public Livraison(Enfant enfant, Cadeau cadeau) {
        this.enfant = enfant;
        this.cadeau = cadeau;
    }

    public Livraison(String etat, Enfant enfant, Cadeau cadeau) {
        this(enfant, cadeau);
        this.etat = etat;
    }

    public String toString() {
        return "Livraison [etat=" + etat + ", enfant=" + enfant + ", cadeau=" + cadeau + "]";
    }
}
