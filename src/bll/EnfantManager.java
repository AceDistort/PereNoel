package bll;

import bo.Enfant;

import java.util.List;
import java.util.stream.Collectors;

public class EnfantManager {

    private static EnfantManager enfantManager;

    private List<Enfant> catalogue;

    // TODO : ajouter EnfantDAO une fois créé

    private EnfantManager() {
    }

    public static EnfantManager getManager() {
        if (enfantManager == null) {
            enfantManager = new EnfantManager();
        }
        return enfantManager;
    }

    public List<Enfant> findAll(String critere) {
        List<Enfant> enfants = catalogue;

        // TODO règles métiers

        return enfants;
    }

    public Enfant findBy(int indexListe) {
        Enfant enfant = catalogue.get(indexListe);

        // TODO règles métiers

        return enfant;
    }

    public Enfant findBy(long numSecu) {
        Enfant enfant = catalogue.stream().filter(e -> e.getNumeroSecu() == numSecu).findFirst().orElse(null);

        // TODO règles métiers

        return enfant;
    }

    public List<Enfant> findBy(String nom, String prenom) {
        List<Enfant> enfants = catalogue.stream().filter(e -> e.getNom().equals(nom) && e.getPrenom().equals(prenom))
                .collect(Collectors.toList());

        // TODO règles métiers

        return enfants;
    }

    public void add(Enfant enfantAdd) {
        catalogue.add(enfantAdd);

        // TODO règles métiers

        // TODO ajout aussi en BDD avec DAO
    }

    public void update(int indexListe, Enfant enfantModif) {
        catalogue.set(indexListe, enfantModif);

        // TODO règles métiers

        // TODO modification aussi en BDD avec DAO
    }

    public void delete(long numSecu) throws BLLException {
        Enfant enfant = catalogue.stream().filter(e -> e.getNumeroSecu() == numSecu).findFirst().orElse(null);

        if(enfant == null) {
            throw new BLLException("Enfant introuvable");
        }

        catalogue.remove(enfant);

        // TODO suppression aussi en BDD avec DAO
    }

    public void control(Enfant enfant) throws BLLException {
        // TODO règles de vérification de validité d'un enfant
    }

}
