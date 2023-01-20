package bo;

public class Commande {
    private boolean dansLaHotte;
    private Enfant enfant;
    private Cadeau cadeau;

    public Commande() {
    }

    public Commande(Enfant enfant, Cadeau cadeau) {
        this.enfant = enfant;
        this.cadeau = cadeau;
    }

    public String toString() {
        return "Commande [dansLaHotte=" + dansLaHotte + ", enfant=" + enfant + ", cadeau=" + cadeau + "]";
    }
}
